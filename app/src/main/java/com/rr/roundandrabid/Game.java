package com.rr.roundandrabid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Justyn on 4/9/2017.
 */

public class Game extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(Game.this, "New Game", Toast.LENGTH_SHORT).show();
        finish();
    }
}
