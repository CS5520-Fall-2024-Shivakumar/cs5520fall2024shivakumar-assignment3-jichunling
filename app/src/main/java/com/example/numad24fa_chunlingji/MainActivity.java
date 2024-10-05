package com.example.numad24fa_chunlingji;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button showToastButton = findViewById(R.id.showToastButton);
        showToastButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            String message = "Name: Chunling Ji\nEmail: ji.chu@northeastern.edu";
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });

        Button quicCalc = (Button)findViewById(R.id.quicCalc);
        quicCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalcActivity.class);
                startActivity(intent);
            }
        });

    }




}