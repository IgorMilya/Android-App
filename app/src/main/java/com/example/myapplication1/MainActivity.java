package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textViewOppenheimer = findViewById(R.id.textOppenheimer);
        Button buttonChangeText = findViewById(R.id.changeTextButton);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the text of the TextView when the button is clicked
                textViewOppenheimer.setText("New Text is generated");
            }
        });

        Button buttonChangeColor = findViewById(R.id.changeColorButton);

        buttonChangeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change the text color of the TextView when the button is clicked
                textViewOppenheimer.setTextColor(getResources().getColor(R.color.black));
            }
        });
    }
}