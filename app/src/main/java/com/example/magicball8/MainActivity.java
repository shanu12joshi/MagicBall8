package com.example.magicball8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView normal = findViewById(R.id.textView);

        final Button fortuneButton = findViewById(R.id.button2);

         final ImageView image = findViewById(R.id.imageView);

        final int [] array = {R.drawable.ball13x , R.drawable.ball23x, R.drawable.ball33x, R.drawable.ball43x, R.drawable.ball43x, R.drawable.ball53x };

        fortuneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random generateRandomNumber = new Random();

                int number = generateRandomNumber.nextInt(5);

                image.setImageResource(array[number]);



            }
        });

    }
}
