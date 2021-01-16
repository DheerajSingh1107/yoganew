package com.yogai.yogai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BalanceActivity extends AppCompatActivity {
    LinearLayout BalanceBeginner,BalanceIntermediate,BalanceAdvance;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);
        BalanceBeginner=findViewById(R.id.BalanceBeginnerLayout);
        BalanceIntermediate= findViewById(R.id.BalanceIntermediateLayout);
        BalanceAdvance = findViewById(R.id.BalanceAdvanceLayout);

        BalanceBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BalanceActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Balance");
                intent.putExtra("level","beginners");
                startActivity(intent);

            }
        });
        BalanceIntermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BalanceActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Balance");
                intent.putExtra("level","intermediate");
                startActivity(intent);
            }
        });
        BalanceAdvance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BalanceActivity.this,DisplayRoutineActivity.class);
                intent.putExtra("type","Balance");
                intent.putExtra("level","intermediate");
                startActivity(intent);

            }
        });


    }
}