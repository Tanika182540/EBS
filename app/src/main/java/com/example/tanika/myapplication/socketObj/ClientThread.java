package com.example.tanika.myapplication.socketObj;

import com.example.tanika.myapplication.universalObj.Config;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientThread extends Thread {
    private String SERVER_IP;
    private Socket socket;

    public ClientThread(String ipaddr){
        SERVER_IP = ipaddr;
    }

    @Override
    public void run() {

        try {
            InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
            socket = new Socket(serverAddr, Config.SERVER_PORT);
            onCreatedSocket.success(socket);
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
            onCreatedSocket.failed(e1);
        } catch (IOException e1) {
            e1.printStackTrace();
            onCreatedSocket.failed(e1);
        }

    }

    private OnCreatedSocket onCreatedSocket;
    public void setOnCreatedSocket(OnCreatedSocket obj){
        onCreatedSocket = obj;
    }

    public interface OnCreatedSocket{
        void success(Socket socket);
        void failed(Exception e);
    }
}
