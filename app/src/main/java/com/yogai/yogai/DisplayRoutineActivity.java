package com.yogai.yogai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

public class DisplayRoutineActivity extends AppCompatActivity {
    String type,level;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_routine);
        Intent intent =getIntent();
        type = intent.getExtras().getString("type");
        level = intent.getExtras().getString("level");
        Toast.makeText(this,type + ","+level,Toast.LENGTH_LONG).show();


    }
}