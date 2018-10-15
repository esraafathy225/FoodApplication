package com.esraa.hp.foodapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   ArrayList<Food> food;
   GridView gridView;
    FoodAdapter adapter;
    Food foods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food=new ArrayList<>();
        food.add(new Food("Cheese Burger","3.5$",R.drawable.burger));
        food.add(new Food("Chicken Shawerma","4.5$",R.drawable.shawerma));
        food.add(new Food("Pancakes","2.99$",R.drawable.pancakes));
        food.add(new Food("Pepperoni Pizza","3.99$",R.drawable.pizza));
        food.add(new Food("Fillet Steak","10.5$",R.drawable.filletsteak));
        food.add(new Food("Chocolate Waffles","2.5$",R.drawable.waffles));


        gridView=findViewById(R.id.grid);
        adapter=new FoodAdapter(this,food);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                foods= (Food) gridView.getAdapter().getItem(i);
                String title=foods.getTitle();
                String price=foods.getPrice();
                int imageId=foods.getImageId();

                Intent intent=new Intent(MainActivity.this,CartActivity.class);
                intent.putExtra("title",title);
                intent.putExtra("price",price);
                intent.putExtra("image",imageId);
                startActivity(intent);

            }
        });
    }
}
