package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private final List<int[]> combinationList = new ArrayList<>();

    private int [] boxPositions =

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView playerOneName = findViewById(R.id.player_one_name);
        final  TextView playerTwoName = findViewById(R.id.player_two_name);


        final LinearLayout playerOneLayout = findViewById(R.id.playerOneLayout);
        final LinearLayout playerTwoLayout = findViewById(R.id.playerTwoLayout);

        final ImageView image1 = findViewById(R.id.image1);
        final ImageView image2 = findViewById(R.id.image2);
        final ImageView image3 = findViewById(R.id.image3);
        final ImageView image4 = findViewById(R.id.image4);
        final ImageView image5 = findViewById(R.id.image5);
        final ImageView image6 = findViewById(R.id.image6);
        final ImageView image7 = findViewById(R.id.image7);
        final ImageView image8 = findViewById(R.id.image8);
        final ImageView image9 = findViewById(R.id.image9);


    }
}