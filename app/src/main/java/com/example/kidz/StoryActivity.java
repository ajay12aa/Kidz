package com.example.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StoryActivity extends AppCompatActivity {
    TextView textViewTitle,textViewStory;

    String Title[]={"1.The Magic Mango Tree","2.The Talking Parrot","3.The Clever Crow","4.The Mysterious Palace","5.The Brave Princess",
    "6.The Wise Elephant","7.The Magical Saree","8.The Wishing Tree","9.The Brave Boy and the Tiger","10.The Magical Paintbrush"};

    String Story[]={

            "Radha discovers a magical mango tree in her backyard." +
                    " The tree gives her an endless supply of delicious mangoes, but only if she's kind and respectful." +
                    " When Radha shares the mangoes with her friends, she learns the importance of generosity and gratitude." +
                    " However, one day, Radha becomes selfish and takes more mangoes than she needs, and " +
                    "the tree disappears. She learns her lesson and apologizes, and the tree returns," +
                    " teaching her that kindness is always the best policy.",

            "Ravi is being bullied by a boy at school. One day, a mischievous parrot" +
                    " flies into his window and starts talking to him. The parrot" +
                    " teaches Ravi to stand up for himself and gives him the courage " +
                    "to confront the bully. When Ravi finally stands up to the bully, " +
                    "he realizes that the bully is just insecure and needs a friend. " +
                    "Ravi befriends the bully, and they become good friends.",

            "The animals in the forest are having trouble getting water" +
                    " from a nearby stream because it's too far away. A clever " +
                    "crow comes up with a plan to solve the problem by creating " +
                    "a system of buckets and ropes. The animals learn the value of" +
                    " working together to solve problems. However, a group of hunters" +
                    " comes to the forest and starts to capture the " +
                    "animals. The clever crow comes up with another plan" +
                    " to save his friends and teaches them the importance of vigilance and planning.",


            " Five friends go on a hike in the woods and stumble upon a mysterious palace. " +
                    "They have to solve a series of riddles to unlock the secrets of the palace " +
                    "and find a treasure hidden inside. However, one of the friends becomes " +
                    "greedy and tries to take all the treasure for himself. The friends work" +
                    " together to stop him, and they learn that true friendship is more" +
                    " valuable than any treasure.",


            " The evil sorcerer has put a curse on the kingdom, causing all" +
                    " the plants and animals to wither and die. The brave princess" +
                    " goes on a quest to find the sorcerer's lair and defeat him. " +
                    "Along the way, she learns the importance of selflessness and " +
                    "sacrifice. However, the sorcerer proves to be a formidable foe, and " +
                    "the princess must use all her wits and courage to defeat him. " +
                    "She learns that even the bravest hero needs help from friends and family.",

            " The wise old elephant teaches the young elephant how to lead the herd. " +
                    "The young elephant learns that being a leader means taking responsibility " +
                    "for the safety and well-being of others. However, a rival herd tries " +
                    "to take over their territory. The young elephant must use the lessons " +
                    "he's learned to protect his herd and lead them to victory.",

            "Gita inherits a magical saree from her grandmother. The saree has " +
                    "the power to grant wishes, but only if Gita uses them to help others." +
                    " Gita learns the importance of using her powers for good. However," +
                    " a greedy man tries to steal the saree from Gita. She must use her" +
                    " wit and cunning to outsmart him and keep the saree safe.",


            "A group of friends discovers a magical tree in the forest that grants" +
                    " wishes. However, the tree only grants wishes to those who truly" +
                    " deserve them. The friends learn to be careful with their wishes" +
                    " and use them wisely to help others. However, a greedy man from " +
                    "the nearby village hears about the tree and tries to exploit it " +
                    "for his own selfish purposes. The friends must work together to" +
                    " protect the tree and teach the man the " +
                    "importance of kindness and empathy. In the end, the tree teaches" +
                    " everyone that true happiness comes from giving, not receiving.",

            "A brave boy named Rohit lives in a small village surrounded by dense " +
                    "forests. One day, a ferocious tiger starts attacking the" +
                    " villagers and their livestock. Rohit decides to face the tiger " +
                    "to protect his village. Armed only with his wits and bravery, he" +
                    " ventures into the forest to confront the tiger. After a fierce" +
                    " battle, Rohit " +
                    "defeats the tiger and becomes a hero in his village. He teaches " +
                    "everyone that even the smallest person can make a big difference.",

            "A poor boy named Amar loves to draw but can't " +
                    "afford art supplies. One day, he discovers " +
                    "a magical paintbrush that brings his drawings to life." +
                    " Amar uses the paintbrush to help his community, painting houses, " +
                    "bridges, and schools. However, a greedy merchant tries to steal" +
                    " the paintbrush from Amar, hoping to use it for his " +
                    "own selfish purposes. With the help of his friends, Amar outwits " +
                    "the merchant and teaches him the value of kindness and generosity."


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        textViewTitle=findViewById(R.id.textViewTitle);
        textViewStory=findViewById(R.id.textViewStory);


        String story1=getIntent().getStringExtra("key1");
        String story2=getIntent().getStringExtra("key2");
        String story3=getIntent().getStringExtra("key3");
        String story4=getIntent().getStringExtra("key4");
        String story5=getIntent().getStringExtra("key5");
        String story6=getIntent().getStringExtra("key6");
        String story7=getIntent().getStringExtra("key7");
        String story8=getIntent().getStringExtra("key8");
        String story9=getIntent().getStringExtra("key9");
        String story10=getIntent().getStringExtra("key10");

        if(story1!=null)
        {

            textViewTitle.setText(Title[0]);
            textViewStory.setText(Story[0]);

        }

        else if(story2!=null)
        {

            textViewTitle.setText(Title[1]);
            textViewStory.setText(Story[1]);

        }


        else if(story3!=null)
        {

            textViewTitle.setText(Title[2]);
            textViewStory.setText(Story[2]);

        }



        else if(story4!=null)
        {

            textViewTitle.setText(Title[3]);
            textViewStory.setText(Story[3]);

        }



        else if(story5!=null)
        {

            textViewTitle.setText(Title[4]);
            textViewStory.setText(Story[4]);

        }


        else if(story6!=null)
        {

            textViewTitle.setText(Title[5]);
            textViewStory.setText(Story[5]);

        }



        else if(story7!=null)
        {

            textViewTitle.setText(Title[6]);
            textViewStory.setText(Story[6]);

        }



        else if(story8!=null)
        {

            textViewTitle.setText(Title[7]);
            textViewStory.setText(Story[7]);

        }



        else if(story9!=null)
        {

            textViewTitle.setText(Title[8]);
            textViewStory.setText(Story[8]);

        }


        else
        {

            textViewTitle.setText(Title[9]);
            textViewStory.setText(Story[9]);

        }

    }
}