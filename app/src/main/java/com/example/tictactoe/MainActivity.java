package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView playerOneName = findViewById(R.id.player_one_name);
        final  TextView playerTwoName = findViewById(R.id.player_two_name);


        final LinearLayout playerOneLayout = findViewById(R.id.playerOneLayout);
        final LinearLayout playerTwoLayout = findViewById(R.id.playerTwoLayout);

    }
}