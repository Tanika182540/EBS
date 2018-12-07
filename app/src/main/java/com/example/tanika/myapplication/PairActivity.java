package com.example.tanika.myapplication;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tanika.myapplication.socketObj.ClientThread;
import com.example.tanika.myapplication.universalObj.Storage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class PairActivity extends AppCompatActivity {

    private static final String TAG = "BluetoothSPP";

    private EditText rpiIP;
    private Button skipBtn , selBtn;
    private void initWidget(){
        rpiIP = findViewById(R.id.ip_addr);

        skipBtn = findViewById(R.id.skip);
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PairActivity.this , MainActivity.class));
            }
        });

        selBtn = findViewById(R.id.select_dev);
        selBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG ,"Start setup socket");
                setupSocket(rpiIP.getText().toString());
            }
        });
    }

    private void setupSocket(String ipaddr){
        ClientThread clientThread = new ClientThread(ipaddr);
        clientThread.setOnCreatedSocket(new ClientThread.OnCreatedSocket() {
            @Override
            public void success(Socket socket) {
                //Intent to joy stick
                testSend(socket);
            }

            @Override
            public void failed(Exception e) {
                Log.e(TAG , e.getMessage());
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pair);
        initWidget();
    }

    private void testSend(Socket socket){
        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())),
                    true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.println("Hello from android app");
    }
}
