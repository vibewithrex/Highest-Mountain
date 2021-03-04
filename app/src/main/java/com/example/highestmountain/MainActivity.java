package com.example.highestmountain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button showMeButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMeButton = (Button) findViewById(R.id.buttonId);
        showTextView = (TextView) findViewById(R.id.textViewId);

        final String[] mountains = {
                "Everest",
                "Kelimanjaro",
                "Makulu",
                "Kamet",
                "Trivor",
                "K12",
                "Ultar",
                "Spokane"
        };

        showMeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randomNum = rand.nextInt(mountains.length);

                showTextView.setText(mountains[randomNum]);
            }
        });
    }
}