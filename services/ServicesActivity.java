package com.example.ioann.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.DialogInterface;

public class ServicesActivity extends AppCompatActivity  {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Services);

        button1 = (Button) findViewById(R.id.textView2);
        button2 = (Button) findViewById(R.id.textView8);
        button3 = (Button) findViewById(R.id.textView7);
        button4 = (Button) findViewById(R.id.textView9);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                opentv2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                opentv1();
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                opentv2();
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                opentv1();
            }
        });
    }

    public void opentv2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(ServicesActivity.this);
        builder.setMessage("Το προϊόν που επιλέξατε δεν είναι διαθέσιμο προς ενοικίαση.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),ServicesActivity.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }

    public void opentv1(){

        AlertDialog.Builder builder = new AlertDialog.Builder(ServicesActivity.this);
        builder.setMessage("Το προϊόν που επιλέξατε είναι διαθέσιμο προς ενοικίαση.\n" +
                "Μπορείτε να το παραλάβετε από το Φαρμακείο.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),ServicesActivity.class);
                        startActivity(intent);
                    }
                });

        AlertDialog alert = builder.create();
        alert.show();
    }





}