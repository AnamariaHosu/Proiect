package com.example.recipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageListAdapter extends BaseAdapter {

    private final String[] imageTitles;
    private Context context;
    private int[] images;

    public ImageListAdapter(Context context, int[] images, String[] imageTitles) {
        this.context = context;
        this.images = images;
        this.imageTitles=imageTitles;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false);
        } else {
            view = convertView;
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        TextView textView = view.findViewById(R.id.textView);
        textView.setText(imageTitles[position]);

        return view;
    }






}
