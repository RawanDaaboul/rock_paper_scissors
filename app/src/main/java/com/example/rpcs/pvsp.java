package com.example.rpcs;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pvsp extends AppCompatActivity {

    ImageButton rock,paper,scissors;
     String player_1,player_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pvsp);

        rock=findViewById(R.id.imagebtnrock);
        paper=findViewById(R.id.imagebtnpaper);
        scissors=findViewById(R.id.imagebtnscissors);



        rock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                     player_1 = "rock";

            }
        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 player_1="paper";
            }

        });
        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 player_1="scissors";
            }

        });
            rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                     player_2="rock";
                }

            });
            paper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                     player_2="paper";
                }

            });
            scissors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    player_2="scissors";
                }

            });

            if(player_1=="rock" && player_2=="scissors") {
                String winner = "player_1";
                Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            }
            else if(player_1=="rock" && player_2=="paper") {
                String winner = "player_2";
                Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            }
            else if(player_1=="scissors" && player_2=="paper") {
                String winner = "player_1";
                Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            }
            else if(player_1=="paper" && player_2=="rock") {
                String winner = "player_1";
                Toast.makeText(this, "Player 1 Wins!", Toast.LENGTH_SHORT).show();
            }
            else if(player_1=="paper" && player_2=="scissors") {
                String winner = "player_2";
                Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            }
            else if(player_1=="scissors" && player_2=="rock") {
                String winner = "player_2";
                Toast.makeText(this, "Player 2 Wins!", Toast.LENGTH_SHORT).show();
            }
            else{
                String winner="draw";
                Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
            }




    }
}