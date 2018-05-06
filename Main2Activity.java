package com.example.acer.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    final DBHandler dbHandler  = new DBHandler(this);

    Button favlistbutton,voicebutton;
    TextView sentence,meaning,word;
    DBHandler2 dbHandler2 = new DBHandler2(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in = getIntent();
        String tv1= in.getExtras().getString("wordname");

        favlistbutton = (Button) findViewById(R.id.favlistbutton);
        voicebutton = (Button) findViewById(R.id.voicelistbutton);
        sentence = findViewById(R.id.sentence);
        meaning = findViewById(R.id.meaning);
        word = findViewById(R.id.wordName);

        final String[] data = dbHandler.getAllDetailsOfWord(tv1).split(":");

        word.setText(data[1]);   //word
        meaning.setText(data[2]);   //sentence
        sentence.setText(data[3]);    //meaning

        favlistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        if(dbHandler2.wordExist(data[1])!=0){
                            Toast.makeText(getApplicationContext(),"Word already exists in the Fav list",Toast.LENGTH_SHORT).show();
                        }else{
                            dbHandler2.addContact(new Contacts2(0,data[1],"1"));
                            dbHandler.updateStarTo1(data[1]);
                            Toast.makeText(getApplicationContext(),dbHandler.getAllDetailsOfWord(data[1]),Toast.LENGTH_SHORT).show();
                        }
            }
        });
        voicebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        Toast.makeText(getApplicationContext(), data[4],Toast.LENGTH_SHORT).show();
    }
}
