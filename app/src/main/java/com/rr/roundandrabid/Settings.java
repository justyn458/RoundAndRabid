package com.rr.roundandrabid;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

/**
 * Created by Justyn on 4/9/2017.
 */

public class Settings extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(Settings.this, "Change your settings", Toast.LENGTH_SHORT).show();
    }
}
