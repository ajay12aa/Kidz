package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StorySelectionActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_selection);
        button1=findViewById(R.id.story1);
        button2=findViewById(R.id.story2);
        button3=findViewById(R.id.story3);
        button4=findViewById(R.id.story4);
        button5=findViewById(R.id.story5);
        button6=findViewById(R.id.story6);
        button7=findViewById(R.id.story7);
        button8=findViewById(R.id.story8);
        button9=findViewById(R.id.story9);
        button10=findViewById(R.id.story10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key1","story1");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key2","story2");
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key3","story3");
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key4","story4");
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key5","story5");
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key6","story6");
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key7","story7");
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key8","story8");
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key9","story9");
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(StorySelectionActivity.this,StoryActivity.class);
                intent.putExtra("key10","story10");
                startActivity(intent);
            }
        });

    }


}