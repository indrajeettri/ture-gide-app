package com.example.hp.madhyapradesh;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4,editText5;
    Button button3;
    String namee,pw,rp,ph,mail;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editText1=(EditText)findViewById(R.id.edit1);
        editText2=(EditText)findViewById(R.id.edit2);
        editText3=(EditText)findViewById(R.id.edit3);
        editText4=(EditText)findViewById(R.id.edit4);
        editText5=(EditText)findViewById(R.id.edit5);
        button3=(Button)findViewById(R.id.bun3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                namee=editText1.getText().toString() ;
                pw=editText2.getText().toString() ;
                rp=editText3.getText().toString();
                ph=editText4.getText().toString();
                mail=editText5.getText().toString() ;
                if((namee!=null)&&(pw!=null)&&(rp!=null)&&(ph!=null)&&(mail!=null))

                {
                    if(ph.length()==10)
                    {
                        if(pw.equals(rp))
                        {
                            pref=getSharedPreferences("login",MODE_PRIVATE);
                            editor=pref.edit();
                            editor.putString("username",namee);
                            editor.putString("password",pw);
                            editor.putString("contect",ph);
                            editor.putString("email",mail);
                            editor.commit();
                            Intent in=new Intent(Signup.this,UserInfo.class);
                            startActivity(in);
                            Toast.makeText(getApplicationContext(),"succesfully saved",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Renter same passwords in both filds",Toast.LENGTH_SHORT).show();
                        }

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"Enter valic contact no.",Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"some field is missing ... every field",Toast.LENGTH_SHORT).show();

                }    }
        });
    }
}
