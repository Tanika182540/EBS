package com.example.tanika.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    ImageButton btnKeyUp, btnKeyLeft, btnKeyRight, btnKeyDown, btnKeyTri, btnKeySq, btnKeyO, btnKeyX;
    Button btnStart, btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKeyUp = findViewById(R.id.btnUp);
        btnKeyLeft = findViewById(R.id.btnLeft);
        btnKeyRight = findViewById(R.id.btnRight);
        btnKeyDown = findViewById(R.id.btnDown);
        btnKeyTri = findViewById(R.id.btnTri);
        btnKeySq = findViewById(R.id.btnSq);
        btnKeyO = findViewById(R.id.btnO);
        btnKeyX = findViewById(R.id.btnX);
        btnStart = findViewById(R.id.btnStart);
        btnReset = findViewById(R.id.btnReset);


        btnKeyUp.setOnTouchListener(this);
        btnKeyLeft.setOnTouchListener(this);
        btnKeyRight.setOnTouchListener(this);
        btnKeyDown.setOnTouchListener(this);
        btnKeyTri.setOnTouchListener(this);
        btnKeySq.setOnTouchListener(this);
        btnKeyO.setOnTouchListener(this);
        btnKeyX.setOnTouchListener(this);
        btnStart.setOnTouchListener(this);
        btnReset.setOnTouchListener(this);
    }


    String keySend = "";
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()){
            case R.id.btnUp:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "up_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "up_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;
            case R.id.btnLeft:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "left_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "left_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;

            case R.id.btnRight:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "right_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "right_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;
            case R.id.btnDown:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "down_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "down_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;

            case R.id.btnTri:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "keyX_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "keyX_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;

            case R.id.btnSq:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend= "keyZ_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend= "keyZ_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;

            case R.id.btnO:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend="keyC_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend= "keyC_pressed";
                        Log.d("KEY",keySend);
                        break;
                }
                break;

            case R.id.btnX:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "space_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "space_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;

            case R.id.btnStart:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "start_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "start_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;

            case R.id.btnReset:
                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        keySend = "reset_pressed";
                        Log.d("KEY",keySend);
                        break;
                    case MotionEvent.ACTION_UP:
                        keySend = "reset_released";
                        Log.d("KEY",keySend);
                        break;
                }
                break;
        }

        return false;
    }
}
