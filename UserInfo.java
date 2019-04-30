package com.example.hp.madhyapradesh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserInfo extends AppCompatActivity {
    Button bt2 ,btn3;
    EditText editText;
    EditText editText1;
    String username,password;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        editText=findViewById(R.id.edit1);
        editText1=findViewById(R.id.edit1);
        bt2=findViewById(R.id.but1);
        btn3=findViewById(R.id.but2);


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=editText.getText().toString();
                password=editText1.getText().toString();
                sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);
                String ckname=sharedPreferences.getString("username","");
                String ckpw=sharedPreferences.getString("password","");
                if ((username.equals(ckname)) && (password.equals(ckpw))) {
                    Intent intent=new Intent(UserInfo.this,AllPlaces.class);
                    intent.putExtra("name",ckname);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"False data  entered",Toast.LENGTH_SHORT).show();
                }
            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(UserInfo.this, Signup.class);
                startActivity(intent);
            }
        });
    }
}
