package com.example.panta.farmakio_client;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AddProduct extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);



    }
    public void increment(View v){
        TextView quantity_tv = findViewById(R.id.quantityTextView);
        int qua = Integer.parseInt(quantity_tv.getText().toString());
        qua++;
        quantity_tv.setText(qua+"");
    }
    public void decrement(View v){
        TextView quantity_tv = findViewById(R.id.quantityTextView);
        int qua = Integer.parseInt(quantity_tv.getText().toString());
        if(qua==1){
            return;
        }
        qua--;
        quantity_tv.setText(qua+"");
    }
    public void addToCart(View v){

        AlertDialog.Builder builder = new AlertDialog.Builder(AddProduct.this);

        builder.setMessage("Θέλετε να δείτε το καλάθι σας;")
                .setPositiveButton("Ναι", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent_Cart = new Intent(getApplicationContext(),Cart.class);
                        startActivity(intent_Cart);
                    }
                })
                .setNegativeButton("Συνεχίστε την Περιήγηση",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent_Product = new Intent(getApplicationContext(),Product.class);
                        startActivity(intent_Product);
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
        Toast.makeText(this,"The Item has been added to your Cart",Toast.LENGTH_SHORT).show();

    }
}
