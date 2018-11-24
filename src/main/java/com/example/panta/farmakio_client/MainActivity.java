package com.example.panta.farmakio_client;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

       // Toolbar toolbar= findViewById(R.id.app_bar);

    }

    @Override
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

                Intent intent_cart = new Intent(getApplicationContext(),Cart.class);
                startActivity(intent_cart);

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

    // shows the cart and the settings to the action bar
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


}
