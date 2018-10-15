package com.esraa.hp.foodapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class CartActivity extends AppCompatActivity {

    TextView textView ,textView1;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        textView=findViewById(R.id.txt);
        textView1=findViewById(R.id.txt1);
        imageView=findViewById(R.id.img);

        String title =getIntent().getStringExtra("title");
        String price =getIntent().getStringExtra("price");
        int imageId=getIntent().getIntExtra("image",0);

        textView.setText(title);
        textView1.setText(price);
        imageView.setImageResource(imageId);




    }
}
