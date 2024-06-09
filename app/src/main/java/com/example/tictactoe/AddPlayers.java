package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        EditText edplayerOne = findViewById(R.id.edplayerOneName);
        EditText edplayerTwo = findViewById(R.id.edplayerTwoName);
        Button startGame = findViewById(R.id.startGameButton);


        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerOneName = edplayerOne.getText().toString();
                String playerTwoName = edplayerTwo.getText().toString();

                if (playerOneName.isEmpty() || playerTwoName.isEmpty()){
                    Toast.makeText(AddPlayers.this, "Please Enter Player Name", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(AddPlayers.this,MainActivity.class);
                    intent.putExtra("playerOne",playerOneName);
                    intent.putExtra("playerTwo",playerTwoName);
                    startActivity(intent);
                }
            }
        });

    }
}