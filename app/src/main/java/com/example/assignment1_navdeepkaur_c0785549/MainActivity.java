package com.example.assignment1_navdeepkaur_c0785549;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private ImageView computerDice, userDice;
    private Button buttonLower, buttonHigher;
    private TextView textViewResult;
    Random random = new Random();
    private int computerRandom, userRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        computerDice = findViewById(R.id.computer_dice);
        userDice = findViewById(R.id.user_dice);

        buttonLower = findViewById(R.id.button_lower);
        buttonHigher = findViewById(R.id.button_higher);

        textViewResult = findViewById(R.id.text_view_result);

        buttonLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandom();
                if(computerRandom < userRandom){
                    textViewResult.setText("COMPUTER WINS!");
                }
                else if(computerRandom > userRandom){
                    textViewResult.setText("USER WINS!");
                }
                else {
                    textViewResult.setText("IT'S A TIE");
                }
            }
        });

        buttonHigher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandom();
                if(computerRandom > userRandom){
                    textViewResult.setText("COMPUTER WINS!");
                }
                else if(computerRandom < userRandom){
                    textViewResult.setText("USER WINS!");
                }
                else {
                    textViewResult.setText("IT'S A TIE");
                }
            }
        });

    }

    private void generateRandom() {
        computerRandom = random.nextInt(6) + 1;
        userRandom = random.nextInt(6) + 1;
        rollDice(computerRandom, userRandom);
    }

    private void rollDice(int cpuRandom, int playerRandom) {
        char dice1 = (char) (cpuRandom + '0');
        char dice2 = (char) (playerRandom + '0');
        switch(dice1){
            case '1' :
                computerDice.setImageResource(R.drawable.dice1);
                break;
            case '2' :
                computerDice.setImageResource(R.drawable.dice2);
                break;
            case '3' :
                computerDice.setImageResource(R.drawable.dice3);
                break;
            case '4' :
                computerDice.setImageResource(R.drawable.dice4);
                break;
            case '5' :
                computerDice.setImageResource(R.drawable.dice5);
                break;
            case '6' :
                computerDice.setImageResource(R.drawable.dice6);
                break;
            default:
        }
        switch(dice2){
            case '1' :
                userDice.setImageResource(R.drawable.dice1);
                break;
            case '2' :
                userDice.setImageResource(R.drawable.dice2);
                break;
            case '3' :
                userDice.setImageResource(R.drawable.dice3);
                break;
            case '4' :
                userDice.setImageResource(R.drawable.dice4);
                break;
            case '5' :
                userDice.setImageResource(R.drawable.dice5);
                break;
            case '6' :
                userDice.setImageResource(R.drawable.dice6);
                break;
            default:
        }
    }
}