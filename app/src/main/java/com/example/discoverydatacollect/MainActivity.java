package com.example.discoverydatacollect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void campane(View view) {
        Toast.makeText(this, "CAMPANIES", Toast.LENGTH_SHORT).show();
    }

    public void localization(View view) {
        Toast.makeText(this, "LOCALIZATION", Toast.LENGTH_SHORT).show();
    }

    public void gasstation(View view) {
        Toast.makeText(this, "GAS STATION", Toast.LENGTH_SHORT).show();
    }

    public void district(View view) {
        Toast.makeText(this, "DISTRICT", Toast.LENGTH_SHORT).show();
    }

    public void instituation(View view) {
        Toast.makeText(this, "INSTITUATION", Toast.LENGTH_SHORT).show();
    }
}