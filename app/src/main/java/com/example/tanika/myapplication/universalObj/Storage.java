package com.example.tanika.myapplication.universalObj;

import android.util.Log;

import java.net.Socket;

public class Storage {

    private static final String TAG = "Storage";
    private static Socket sock;

    public static void setSocket(Socket newSocket){
        sock = newSocket;
    }

    public static Socket getSocket(){
        if (sock == null){
            Log.e(TAG , "socket obj is null");
        }
        return sock;
    }
}
