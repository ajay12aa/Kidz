package com.example.kidz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {


    Context context;
    String [] imageName;
    int [] image;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] imageName, int[] image) {
        this.context = context;
        this.imageName = imageName;
        this.image = image;
    }

    @Override
    public int getCount() {
        return imageName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater==null)
        {
            inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.grid_item,null);
        }

        ImageView imageView=convertView.findViewById(R.id.gridImageView);
        TextView textView=convertView.findViewById(R.id.gridTextview);

        imageView.setImageResource(image[position]);
        textView.setText(imageName[position]);


        return convertView;
    }
}
