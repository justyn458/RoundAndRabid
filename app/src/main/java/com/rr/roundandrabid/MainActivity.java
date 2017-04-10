package com.rr.roundandrabid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button startGame,settings,stats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create game buttons
        startGame = (Button) findViewById(R.id.start);
        settings = (Button) findViewById(R.id.settings);
        stats = (Button) findViewById(R.id.stats);

        //add button functions
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Starting a New Game", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Game.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Finishing a New Game", Toast.LENGTH_SHORT).show();
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Starting a Setting", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, Settings.class);
                startActivity(i);
            }
        });
    }

}