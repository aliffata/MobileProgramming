package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView ezyDrink;
    private ImageView ezyCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ezyDrink = (CardView) findViewById(R.id.ezy_drink);
        ezyCart = findViewById(R.id.ezy_cart);

        ezyDrink.setOnClickListener(this);
        ezyCart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.ezy_drink: i = new Intent(this,Drinks.class);
            startActivity(i);
            break;

            case  R.id.ezy_cart: i = new Intent(this,Cart.class);
            startActivity(i);
            break;
        }

    }
}
