package com.esraa.hp.foodapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 2018-10-13.
 */

public class FoodAdapter extends ArrayAdapter<Food> {

    public FoodAdapter(@NonNull Context context, @NonNull ArrayList<Food> food) {
        super(context, 0,food);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_grid,parent,false);
        TextView title=convertView.findViewById(R.id.txt);
        TextView price=convertView.findViewById(R.id.txt1);
        ImageView imageView=convertView.findViewById(R.id.img);

        Food food=getItem(position);
        title.setText(food.getTitle());
        price.setText(food.getPrice());
        imageView.setImageResource(food.getImageId());

        return convertView;
    }


}
