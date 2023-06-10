package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class VegetablesActivity extends AppCompatActivity {
    GridView gridViewVegetable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        gridViewVegetable=findViewById(R.id.gridViewVegetables);

        String numberName[]= {
                "ACORNSQUASH", "ASPARAGUS", "BEETROOT", "BUTERNUTSQUASH", "CABBAGE",
                "CARROT", "CAULIFLOWER", "CHILLI", "DILL", "EGGPLANT", "ENDIVE",
                "GARLIC", "GREENBEANS", "HABANEROPEPPER", "KALE", "LEEK",
                "LETTUCE", "MUSHROOM", "OKRA", "ONION", "POTATO",
                "RADISH", "SPINACH", "TOMATO"
        };
        int numberids[]={R.drawable.acornsquash,
                R.drawable.asparagus,
                R.drawable.beetroot
                ,R.drawable.butternutsquash,
                R.drawable.cabbage,
                R.drawable.carrot,
                R.drawable.cauliflower
                ,R.drawable.chilli,
                R.drawable.dill,
                R.drawable.eggplant,
                R.drawable.endive,
                R.drawable.garlic,
                R.drawable.greenbeans,
                R.drawable.habaneropepper,
                R.drawable.kale,
                R.drawable.leek,
                R.drawable.lettuce,
                R.drawable.mushroom,
                R.drawable.okra,
                R.drawable.onion,
                R.drawable.potato,
                R.drawable.radish,
                R.drawable.spinach,
                R.drawable.tomato


        };
        GridAdapter adapter=new GridAdapter(getApplicationContext(),numberName,numberids);
        gridViewVegetable.setAdapter(adapter);


    }
}