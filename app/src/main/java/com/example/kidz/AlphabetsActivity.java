package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.kidz.databinding.ActivityMainBinding;

public class AlphabetsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_alphabets);
        GridView gridView=findViewById(R.id.gridViewAlphabets);

        String numberName[]= {"A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int numberids[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
                R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l
                ,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,
                R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z};
        GridAdapter adapter=new GridAdapter(getApplicationContext(),numberName,numberids);
        gridView.setAdapter(adapter);







    }
}