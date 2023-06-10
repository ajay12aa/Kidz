package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.GridView;

public class BirdsActivity extends AppCompatActivity {

    GridView gridViewBirds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);

        gridViewBirds=findViewById(R.id.gridViewBirds);

        String numberName[]= {
                "ALBATROSS",
                "BULEJAY",
                "CANARY",
                "CHICKEN",
                "CROW",
                "DOVE",
                "DUCK",
                "EAGLE",
                "EMU",
                "FLAMINGO",
                "HUMMINGBIRD",
                "MACAW",
                "OSTRICH",
                "OWL",
                "PARROT",
                "PEACOCK",
                "PELICAN",
                "PENGUIN",

                "PIGEON",
                "ROBIN",
                "SEAGULL",
                "SHOEBILL",
                "SPARROW",
                "SWAN",
                "TOUCAN",
                "WOODPECKER"
        };
        int numberids[]={R.drawable.albatross,
                R.drawable.bluejay,
                R.drawable.canary
                ,R.drawable.chicken,
                R.drawable.crow,
                R.drawable.dove,
                R.drawable.duck,
                R.drawable.eagle
                ,R.drawable.emu,
                R.drawable.flamingo,
                R.drawable.hummingbird,
                R.drawable.macaw,
                R.drawable.ostrich,
                R.drawable.owl,
                R.drawable.parrot,
                R.drawable.peacock,
                R.drawable.pelican,
                R.drawable.penguin,
                R.drawable.pigeon,
                R.drawable.robin,
                R.drawable.seagull,
                R.drawable.shoebill,
                R.drawable.sparrow,
                R.drawable.swan,
                R.drawable.toucan,
                R.drawable.woodpecker

        };
        GridAdapter adapter=new GridAdapter(getApplicationContext(),numberName,numberids);
        gridViewBirds.setAdapter(adapter);
    }
}