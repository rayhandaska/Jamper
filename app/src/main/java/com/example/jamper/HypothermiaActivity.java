package com.example.jamper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HypothermiaActivity extends AppCompatActivity {
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hypothermia);

        btn3 = findViewById(R.id.button_back);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HypothermiaActivity.this, MainPage1Activity.class));
            }
        });


    }

}