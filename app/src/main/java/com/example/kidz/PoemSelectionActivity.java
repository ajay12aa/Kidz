package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PoemSelectionActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem_selection);
        button1=findViewById(R.id.poem1);
        button2=findViewById(R.id.poem2);
        button3=findViewById(R.id.poem3);
        button4=findViewById(R.id.poem4);
        button5=findViewById(R.id.poem5);
        button6=findViewById(R.id.poem6);
        button7=findViewById(R.id.poem7);
        button8=findViewById(R.id.poem8);
        button9=findViewById(R.id.poem9);
        button10=findViewById(R.id.poem10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key1","poem1");
                startActivity(intent);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key2","poem2");
                startActivity(intent);

            }
        });



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key3","poem3");
                startActivity(intent);

            }
        });



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key4","poem4");
                startActivity(intent);

            }
        });



        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key5","poem5");
                startActivity(intent);

            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key6","poem6");
                startActivity(intent);

            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key7","poem7");
                startActivity(intent);

            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key8","poem8");
                startActivity(intent);

            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key9","poem9");
                startActivity(intent);

            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(PoemSelectionActivity.this,PoemActivity.class);
                intent.putExtra("key10","poem10");
                startActivity(intent);

            }
        });

    }
}