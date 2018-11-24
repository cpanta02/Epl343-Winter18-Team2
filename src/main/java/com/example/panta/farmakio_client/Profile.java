package com.example.panta.farmakio_client;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends MainActivity{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.home_page:
                Toast.makeText(this,"Home page !!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.calendar:
                Toast.makeText(this,"Calendar",Toast.LENGTH_SHORT).show();
                break;
            case R.id.product:
                Intent intent_product = new Intent(getApplicationContext(),ProductActivity.class);
                startActivity(intent_product);
                Toast.makeText(this,"Products",Toast.LENGTH_SHORT).show();
                break;
            case R.id.services:
                Toast.makeText(this,"Services",Toast.LENGTH_SHORT).show();
                break;
            case R.id.communication:
                Toast.makeText(this,"Communication",Toast.LENGTH_SHORT).show();
                break;
            case R.id.chat:
                Toast.makeText(this,"Chat",Toast.LENGTH_SHORT).show();
                break;
            case R.id.overnight_pharmacies:
                Toast.makeText(this,"Overnight Pharmacies",Toast.LENGTH_SHORT).show();
                break;

        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        switch(item.getItemId()){
            case R.id.cart:
                Toast.makeText(this,"Cart",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_account:
                Toast.makeText(this,"Account",Toast.LENGTH_SHORT).show();

                Intent intent_profile = new Intent(getApplicationContext(),Profile.class);
                startActivity(intent_profile);


                break;
            case R.id.action_language:
                Toast.makeText(this,"Language",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void pastOrder1(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
        builder.setMessage("Θέλετε να προσθέσετε αυτή την παραγξελεία στο καλάθι σας;")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent_Cart = new Intent(getApplicationContext(),Cart.class);
                        startActivity(intent_Cart);
                    }
                })
                .setNegativeButton("Οχι",null);

        AlertDialog alert = builder.create();
        alert.show();

    }
    public void pastOrder2(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
        builder.setMessage("Θέλετε να προσθέσετε αυτή την παραγξελεία στο καλάθι σας;")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent_Cart = new Intent(getApplicationContext(),Cart.class);
                        startActivity(intent_Cart);
                    }
                })
                .setNegativeButton("Οχι",null);

        AlertDialog alert = builder.create();
        alert.show();

    }
    public void pastOrder3(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
        builder.setMessage("Θέλετε να προσθέσετε αυτή την παραγξελεία στο καλάθι σας;")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent_Cart = new Intent(getApplicationContext(),Cart.class);
                        startActivity(intent_Cart);
                    }
                })
                .setNegativeButton("Οχι",null);

        AlertDialog alert = builder.create();
        alert.show();

    }
    public void pastOrder4(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
        builder.setMessage("Θέλετε να προσθέσετε αυτή την παραγξελεία στο καλάθι σας;")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent_Cart = new Intent(getApplicationContext(),Cart.class);
                        startActivity(intent_Cart);
                    }
                })
                .setNegativeButton("Οχι",null);

        AlertDialog alert = builder.create();
        alert.show();

    }
    public void pastOrder5(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(Profile.this);
        builder.setMessage("Θέλετε να προσθέσετε αυτή την παραγξελεία στο καλάθι σας;")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent_Cart = new Intent(getApplicationContext(),Cart.class);
                        startActivity(intent_Cart);
                    }
                })
                .setNegativeButton("Οχι",null);

        AlertDialog alert = builder.create();
        alert.show();

    }
    public void EditEmail(View v){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(Profile.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog, null);
       TextView title = mView.findViewById(R.id.Title);
        title.setText("Άλλαξε Email");
        final EditText etchange =  mView.findViewById(R.id.EditInfo);
        etchange.setHint("Νέο Email");
        etchange.setInputType(InputType.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS);
        Button btchange =  mView.findViewById(R.id.btnChange);
        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();

        btchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvemail = findViewById(R.id.tvEmail);
                tvemail.setText(etchange.getText().toString());
                Toast.makeText(Profile.this,"Το Email σας έχει αλλάξει.",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
    }
    public void EditPhone(View v){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(Profile.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog, null);
        TextView title = mView.findViewById(R.id.Title);
        title.setText("Άλλαξε Τηλέφωνο");
        final EditText etchange =  mView.findViewById(R.id.EditInfo);
        etchange.setHint("+357 XX XXX XXX");
        etchange.setInputType(InputType.TYPE_CLASS_PHONE);
        Button btchange =  mView.findViewById(R.id.btnChange);
        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();

        btchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tvphone = findViewById(R.id.tvPhone);
                tvphone.setText(etchange.getText().toString());
                Toast.makeText(Profile.this,"Το Τηλέφωνο σας έχει αλλάξει.",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });

    }
    public void EditPass(View v){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(Profile.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog, null);
        TextView title = mView.findViewById(R.id.Title);
        title.setText("Άλλαξε Κωδικό");
        final EditText etchange =  mView.findViewById(R.id.EditInfo);
        etchange.setHint("Νέος Κωδικός");
        Button btchange =  mView.findViewById(R.id.btnChange);
        mBuilder.setView(mView);
        final AlertDialog dialog = mBuilder.create();
        dialog.show();

        btchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Profile.this,"Ο κωδικός σας έχει αλλάξει.",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
    }
}
