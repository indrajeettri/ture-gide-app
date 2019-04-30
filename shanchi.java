package com.example.hp.madhyapradesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class shanchi extends AppCompatActivity {
    Button button;
    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shanchi);
        TextView textView=(TextView)findViewById(R.id.text3);
        textView.setMovementMethod(new ScrollingMovementMethod());
        viewFlipper=(ViewFlipper)findViewById(R.id.khajuraho1);
        button=(Button)findViewById(R.id.btn6);
        Button button1=(Button)findViewById(R.id.btn7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(shanchi.this,Hotal.class);
                startActivity(intent);
            }
        });

        android.view.animation.Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        android.view.animation.Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        viewFlipper.setInAnimation(in);
        viewFlipper.setOutAnimation(out);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
    }
}
