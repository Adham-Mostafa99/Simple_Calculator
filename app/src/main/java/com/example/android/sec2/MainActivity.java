package com.example.android.sec2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    EditText ed1,ed2;
    TextView txt;
    Button sum,min,mult,div;
    String numone;
    String numtwo;
    double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1=(EditText)findViewById(R.id.edit1);
        ed2=(EditText)findViewById(R.id.edit2);
        txt=(TextView) findViewById(R.id.txt2);
        sum=(Button) findViewById(R.id.but1);
        min=(Button) findViewById(R.id.but2);
        mult=(Button) findViewById(R.id.but3);
        div=(Button) findViewById(R.id.but4);
        sum.setOnClickListener(this);
        min.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);

    }

@Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.but1:
                numone=ed1.getText().toString();
                numtwo=ed2.getText().toString();
                if(numone.length()==0||numtwo.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter number",Toast.LENGTH_LONG).show();
                }

                else{
                    result=Double.parseDouble(numone)+Double.parseDouble(numtwo);
                    txt.setText(String.valueOf(result));
                }
                break;
           case R.id.but2:
                numone=ed1.getText().toString();
                numtwo=ed2.getText().toString();
                if(numone.length()==0||numtwo.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter number",Toast.LENGTH_LONG).show();
                }

                else{
                    result=Double.parseDouble(numone)-Double.parseDouble(numtwo);
                    txt.setText(result+"");
                }break;

            case R.id.but3:
                numone=ed1.getText().toString();
                numtwo=ed2.getText().toString();
                if(numone.length()==0||numtwo.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter number",Toast.LENGTH_LONG).show();
                }

                else{
                    result=Double.parseDouble(numone)*Double.parseDouble(numtwo);
                    txt.setText(result+"");
                }break;

            case R.id.but4:
                numone=ed1.getText().toString();
                numtwo=ed2.getText().toString();
                if(numone.length()==0||numtwo.length()==0){
                    Toast.makeText(getApplicationContext(),"Enter number",Toast.LENGTH_LONG).show();
                }

                else{
                    result=Double.parseDouble(numone)/Double.parseDouble(numtwo);
                    txt.setText(result+"");
                }
                break;
        }
    }


}



