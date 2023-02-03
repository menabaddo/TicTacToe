package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private final List<int[]> combinationList = new ArrayList<>();
    private int [] boxPositions = {0,0,0,0,0,0,0,0,0};
    private int playerTurn = 1;
    private int totalSelectedBoxes = 1;
    private LinearLayout playerOneLayout, playerTwoLayout;
    private TextView playerOneName, playerTwoName;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       playerOneName = findViewById(R.id.player_one_name);
        playerTwoName = findViewById(R.id.player_two_name);


        playerOneLayout = findViewById(R.id.playerOneLayout);
         playerTwoLayout = findViewById(R.id.playerTwoLayout);

        image1 = findViewById(R.id.image1);
         image2 = findViewById(R.id.image2);
         image3 = findViewById(R.id.image3);
       image4 = findViewById(R.id.image4);
       image5 = findViewById(R.id.image5);
       image6 = findViewById(R.id.image6);
       image7 = findViewById(R.id.image7);
       image8 = findViewById(R.id.image8);
       image9 = findViewById(R.id.image9);


       combinationList.add(new int[]{0, 1, 2});
        combinationList.add(new int[]{3, 4, 5});
        combinationList.add(new int[]{6, 7, 8});
        combinationList.add(new int[]{0, 3, 6});
        combinationList.add(new int[]{1, 4, 7});
        combinationList.add(new int[]{2, 5, 8});
        combinationList.add(new int[]{2, 4, 6});
        combinationList.add(new int[]{0, 4, 8});


        final String getPlayerOneName = getIntent().getStringExtra("playerOne");
        final String getPlayerTwoName = getIntent().getStringExtra("playerTwo");

        playerOneName.setText(getPlayerOneName);
        playerTwoName.setText(getPlayerTwoName);



       playerOneLayout.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });

        playerTwoLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });





    }
}