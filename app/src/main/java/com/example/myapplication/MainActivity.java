    package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        int amount = 1;
        int basePrice =5;

        TextView tvtq;
        CheckBox cbc =findViewById(R.id.c);
        CheckBox cbcc =findViewById(R.id.cc);
        CheckBox cbv =findViewById(R.id.v);
        Button btnOrder = findViewById(R.id.btn_order);


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button btnMinus = findViewById(R.id.btn_minus);
            Button btnPlus = findViewById(R.id.btn_plus);
            final TextView tvAmount = findViewById(R.id.tv_amount);
            tvtq = findViewById(R.id.tq);


            btnMinus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //do stuff
                    if (amount>1)
                    amount--;
                    tvAmount.setText(Integer.toString(amount));
                }
            });

            btnPlus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //do stuff
                    amount++;
                    tvAmount.setText(Integer.toString(amount));
                }
            });

            btnOrder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int finalPrice=basePrice;


                    if(cbc.isChecked()){
                        finalPrice=1;
                    }
                    if(cbcc.isChecked()){
                        finalPrice=2;
                    }
                    if(cbv.isChecked()){
                        finalPrice=3;
                    }
                    finalPrice *= amount;

                    Log.d("Final Price",Integer.toString(finalPrice));
                    tvtq.setText("Thank you for your order the total price is "+Integer.toString(finalPrice));
                }
            });

        }
    }
