package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class FruitsActivity extends AppCompatActivity {
    GridView gridViewFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);
        gridViewFruits=findViewById(R.id.gridViewFruits);

        String numberName[]= {
                "AMLA",
                "APPLE",
                "BANANA",
                "CHERRY",
                "DATES",
                "ELDERBERRY",
                "FIG",
                "GRAPES",
                "HONEYMELON",
                "JACKFRUIT",
                "KIWI",
                "LEMON",
                "MANGO",
                "NECTARINE",
                "ORANGE",
                "PAPAYA",
                "PINEAPPLE",
                "QUINCE",
                "RASBERRY",
                "STRAWBERRY",
                "TANGERINE",
                "WATERMELON"
        };
        int numberids[]={R.drawable.amla,
                R.drawable.apple,
                R.drawable.banana
                ,R.drawable.cherry,
                R.drawable.dates,
                R.drawable.elderberry,
                R.drawable.fig
                ,R.drawable.grapes,
                R.drawable.honeydewmelon,
                R.drawable.jackfruit,
                R.drawable.kiwi,
                R.drawable.lemon,
                R.drawable.mango,
                R.drawable.nectarine,
                R.drawable.orange,
                R.drawable.papaya,
                R.drawable.pineapple,
                R.drawable.quince,
                R.drawable.raspberry,
                R.drawable.strawberry,
                R.drawable.tangerine,
                R.drawable.watermelon


        };
        GridAdapter adapter=new GridAdapter(getApplicationContext(),numberName,numberids);
        gridViewFruits.setAdapter(adapter);
    }
}