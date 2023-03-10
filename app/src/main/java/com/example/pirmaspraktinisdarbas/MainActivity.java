package com.example.pirmaspraktinisdarbas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnChangeMainText;
    Button btnChangeMainTextColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);

        this.btnChangeMainText = (Button) findViewById(R.id.btnChangeMainText);
        btnChangeMainText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvMain.setText("Viso gero!");
            }
        });

        this.btnChangeMainTextColor = (Button) findViewById(R.id.btnChangeMainTextColor);
        btnChangeMainTextColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvMain.setTextColor(Color.parseColor("#ED1CE6"));
            }
        });
    }
}