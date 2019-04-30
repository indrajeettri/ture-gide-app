package com.example.hp.madhyapradesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class KanhaKisli extends AppCompatActivity {
    Button button1;
    private ViewFlipper viewFlipper1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanha_kisli);
        viewFlipper1=(ViewFlipper)findViewById(R.id.khajuraho1);
        button1=(Button)findViewById(R.id.btn12);

        android.view.animation.Animation in= AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        android.view.animation.Animation out= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);

        viewFlipper1.setInAnimation(in);
        viewFlipper1.setOutAnimation(out);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper1.showNext();
            }
        });
    }
}
