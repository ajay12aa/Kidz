package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        GridView gridView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        gridView=findViewById(R.id.gridViewNumbers);

        String numberName[]= {"ZERO","ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        int numberids[]={R.drawable.zero,R.drawable.one,R.drawable.two,R.drawable.three,
                R.drawable.four,R.drawable.five,R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine};
        GridAdapter adapter=new GridAdapter(getApplicationContext(),numberName,numberids);
        gridView.setAdapter(adapter);
    }
}