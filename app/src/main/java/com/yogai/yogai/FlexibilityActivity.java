package com.yogai.yogai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FlexibilityActivity extends AppCompatActivity {
    LinearLayout flexiBeginner,flexiIntermediate,flexiAdvance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexibility);
        flexiBeginner=findViewById(R.id.FlexibilityBeginnerLayout);
        flexiIntermediate = findViewById(R.id.FlexibilityIntermediateLayout);
        flexiAdvance = findViewById(R.id.FlexibilityAdvanceLayout);

        flexiBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlexibilityActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Flexibility");
                intent.putExtra("level","beginners");
                startActivity(intent);

            }
        });
        flexiIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlexibilityActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Flexibility");
                intent.putExtra("level","Intermediate");
                startActivity(intent);

            }
        });
        flexiAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlexibilityActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Flexibility");
                intent.putExtra("level","Advance");
                startActivity(intent);

            }
        });

    }
}