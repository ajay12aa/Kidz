package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PoemActivity extends AppCompatActivity {

    TextView textViewTitle,textViewPoem;


    String Poem[]={

             "Twinkle, Twinkle, Little Star\n" +
             "Twinkle, twinkle, little star,\n" +
              "How I wonder what you are!\n" +
              "Up above the world so high,\n" +
             "Like a diamond in the sky.",

            "Mary Had a Little Lamb\n" +
            "Mary had a little lamb,\n" +
            "Its fleece was white as snow;\n" +
            "And everywhere that Mary went,\n" +
            "The lamb was sure to go.",

            "Humpty Dumpty\n" +
            "Humpty Dumpty sat on a wall,\n" +
            "Humpty Dumpty had a great fall;\n" +
            "All the king's horses and all the king's men\n" +
            "Couldn't put Humpty together again.",

            "Little Miss Muffet\n" +
            "Little Miss Muffet\n" +
            "Sat on a tuffet,\n" +
            "Eating her curds and whey;\n" +
            "Along came a spider,\n" +
            "Who sat down beside her,\n" +
            "And frightened Miss Muffet away.\n" +
             "\n",

            "The Itsy Bitsy Spider\n" +
            "The itsy bitsy spider\n" +
            "Climbed up the water spout\n" +
            "Down came the rain\n" +
            "And washed the spider out\n" +
            "Out came the sun\n" +
            "And dried up all the rain\n" +
            "And the itsy bitsy spider\n" +
            "Climbed up the spout again",

            "Row, Row, Row Your Boat\n" +
            "Row, row, row your boat,\n" +
            "Gently down the stream.\n" +
            "Merrily, merrily, merrily, merrily,\n" +
            "Life is but a dream.",

            "Baa, Baa, Black Sheep\n" +
            "Baa, baa, black sheep,\n" +
            "Have you any wool?\n" +
            "Yes sir, yes sir,\n" +
            "Three bags full.\n" +
            "One for the master,\n" +
            "And one for the dame,\n" +
            "And one for the little boy\n" +
            "Who lives down the lane.",

            "Little Bo-Peep\n" +
            "Little Bo-Peep has lost her sheep,\n" +
            "And doesn't know where to find them;\n" +
            "Leave them alone, and they'll come home,\n" +
            "Bringing their tails behind them.",


            "London Bridge Is Falling Down\n" +
            "London Bridge is falling down,\n" +
            "Falling down, falling down,\n" +
            "London Bridge is falling down,\n" +
            "My fair lady.",

             "Hickory Dickory Dock\n" +
             "Hickory dickory dock,\n" +
             "The mouse ran up the clock;\n" +
             "The clock struck one,\n" +
             "And down he run,\n" +
             "Hickory dickory dock."

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);

        textViewTitle=findViewById(R.id.textViewPoemTitle);
        textViewPoem=findViewById(R.id.textViewPoem);

        String key1=getIntent().getStringExtra("key1");
        String key2=getIntent().getStringExtra("key2");
        String key3=getIntent().getStringExtra("key3");
        String key4=getIntent().getStringExtra("key4");
        String key5=getIntent().getStringExtra("key5");
        String key6=getIntent().getStringExtra("key6");
        String key7=getIntent().getStringExtra("key7");
        String key8=getIntent().getStringExtra("key8");
        String key9=getIntent().getStringExtra("key9");
        String key10=getIntent().getStringExtra("key10");

        if(key1!=null)
        {
            textViewTitle.setText("POEM1");
            textViewPoem.setText(Poem[0]);
        }
        else if(key2!=null)
        {
            textViewTitle.setText("POEM2");
            textViewPoem.setText(Poem[1]);
        }

        else if(key3!=null)
        {
            textViewTitle.setText("POEM3");
            textViewPoem.setText(Poem[2]);
        }

        else if(key4!=null)
        {
            textViewTitle.setText("POEM4");
            textViewPoem.setText(Poem[3]);
        }

        else if(key5!=null)
        {
            textViewTitle.setText("POEM5");
            textViewPoem.setText(Poem[4]);
        }


        else if(key6!=null)
        {
            textViewTitle.setText("POEM4");
            textViewPoem.setText(Poem[5]);
        }

        else if(key7!=null)
        {
            textViewTitle.setText("POEM5");
            textViewPoem.setText(Poem[6]);
        }

        else if(key8!=null)
        {
            textViewTitle.setText("POEM6");
            textViewPoem.setText(Poem[7]);
        }

        else if(key9!=null)
        {
            textViewTitle.setText("POEM9");
            textViewPoem.setText(Poem[8]);
        }

        else
        {
            textViewTitle.setText("POEM10");
            textViewPoem.setText(Poem[9]);
        }




    }
}