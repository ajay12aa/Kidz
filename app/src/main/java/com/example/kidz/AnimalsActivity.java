package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class AnimalsActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        gridView=findViewById(R.id.gridViewAnimals);

        String numberName[]= {
                "CHEETAH", "CHIMPANZE", "CROCODILE", "ELEPHENT", "GIRAFFE", "GORILLA", "GRIZZLYBEAR",
                "HIPPO", "KANGAROO", "KOALA",
                "LEOPARD", "LION", "MEERKAT", "MOOSE", "ORANGUTAN", "PANDA", "PLATYPUS",
                "POLARBEAR", "REDPANDA", "RHINO", "TASMANIADEVIL", "TIGER", "WOLF", "ZEBRA"
        };
        int numberids[]={

                R.drawable.cheetah,
                R.drawable.chimpanzee,
                R.drawable.crocodile,
                R.drawable.elephant,
                R.drawable.giraffe,
                R.drawable.gorilla,
                R.drawable.grizzlybear,
                R.drawable.hippopotamus,
                R.drawable.kangaroo,
                R.drawable.koala,
                R.drawable.leopard,
                R.drawable.lion,
                R.drawable.meerkat,
                R.drawable.moose,
                R.drawable.orangutan,
                R.drawable.panda,
                R.drawable.platypus,
                R.drawable.polarbear,
                R.drawable.redpanda,
                R.drawable.rhinoceros,
                R.drawable.tasmaniandevil,
                R.drawable.tiger,
                R.drawable.wolf,
                R.drawable.zebra
        };
        GridAdapter adapter=new GridAdapter(getApplicationContext(),numberName,numberids);
        gridView.setAdapter(adapter);


    }
}