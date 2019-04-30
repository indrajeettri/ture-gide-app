package com.example.hp.madhyapradesh;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MadhyaPradesh extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Handler handler;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhya_pradesh);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MadhyaPradesh.this,UserInfo.class);
                startActivity(intent);
            }
        },5000);

}}
