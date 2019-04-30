package com.example.hp.madhyapradesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AllPlaces extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_places);



        button1=findViewById(R.id.btn4);
        button2=findViewById(R.id.btn5);
        button3=findViewById(R.id.btn6);
        button4=findViewById(R.id.btn7);
        button5=findViewById(R.id.btn8);
        button6=findViewById(R.id.btn9);
        button7=findViewById(R.id.btn10);
        button8=findViewById(R.id.btn11);
        button9=findViewById(R.id.btn12);
        button10=findViewById(R.id.btn13);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(AllPlaces.this,Khajuraho.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(AllPlaces.this,Bhopal.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(AllPlaces.this,shanchi.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(AllPlaces.this,KanhaKisli.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(AllPlaces.this,satpur.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(AllPlaces.this,MaiharDham.class);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();

                Intent intent=new Intent(AllPlaces.this,BhedaGhat.class);
                startActivity(intent);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(AllPlaces.this,BandhaGhar.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(AllPlaces.this,Orcha.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AllPlaces.this,"Butotn clicked",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(AllPlaces.this,Gwaliyer.class);
                startActivity(intent);
            }
        });

    }
}
