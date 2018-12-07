package com.example.tanika.myapplication.socketObj;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class CommandSenderThread extends AsyncTask<String , Void  , Void> {

    private PrintWriter printWriter;
    public CommandSenderThread(PrintWriter sock){
        printWriter = sock;
    }

    @Override
    protected Void doInBackground(String... commands) {
        Log.d("CommandSender" , "Sending : " + commands[0]);
        printWriter.println(commands[0]);
        return null;
    }
}
