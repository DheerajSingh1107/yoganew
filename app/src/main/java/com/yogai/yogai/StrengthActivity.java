package com.yogai.yogai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class StrengthActivity extends AppCompatActivity {

    LinearLayout flexiBegLayout,flexiIntLayout,flexAdavLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength);
        flexiBegLayout = findViewById(R.id.StrengthBeginnerLayout);
        flexiIntLayout = findViewById(R.id.StrengthIntermediate_Layout);
        flexAdavLayout = findViewById(R.id.StrengthAdvanceLayout);
        flexiBegLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StrengthActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Strength");
                intent.putExtra("level","beginners");
                startActivity(intent);
            }
        });
        flexiIntLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StrengthActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Strength");
                intent.putExtra("level","intermediate");
                startActivity(intent);

            }
        });
        flexAdavLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StrengthActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Strength");
                intent.putExtra("level","advance");
                startActivity(intent);
            }
        });

    }
}