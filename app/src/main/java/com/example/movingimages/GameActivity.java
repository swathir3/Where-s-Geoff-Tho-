package com.example.movingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity  extends AppCompatActivity {
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.open_game);
        myButton = findViewById(R.id.StartGame);
        myButton.setOnClickListener(unused -> startActivity(new Intent(this,
                MainActivity.class)));
    }
}
