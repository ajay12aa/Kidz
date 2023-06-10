package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView cardViewAlphabets,cardViewNumbers,cardViewAnimals,cardViewBirds,cardViewVegetables,
    cardViewFruits,cardViewStory,cardViewPoems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cardViewAlphabets=findViewById(R.id.cardViewAlphabets);
        cardViewNumbers=findViewById(R.id.cardViewNumbers);
        cardViewAnimals=findViewById(R.id.cardViewAnimals);
        cardViewBirds=findViewById(R.id.cardViewBirds);
        cardViewVegetables=findViewById(R.id.cardViewVegetables);
        cardViewFruits=findViewById(R.id.cardViewFruits);
        cardViewStory=findViewById(R.id.cardViewStory);
        cardViewPoems=findViewById(R.id.cardViewPoems);





        cardViewAlphabets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,AlphabetsActivity.class);
                startActivity(intent);


            }
        });

        cardViewNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,NumbersActivity.class);
                startActivity(intent);
            }
        });
        cardViewAnimals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,AnimalsActivity.class);
                startActivity(intent);
            }
        });

        cardViewBirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,BirdsActivity.class);
                startActivity(intent);
            }
        });

        cardViewVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,VegetablesActivity.class);
                startActivity(intent);
            }
        });

        cardViewFruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,FruitsActivity.class);
                startActivity(intent);
            }
        });

        cardViewPoems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,PoemSelectionActivity.class);
                startActivity(intent);
            }
        });

        cardViewStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(HomeActivity.this,StorySelectionActivity.class);
                startActivity(intent);
            }
        });
    }
}