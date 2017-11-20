package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

import static com.londonappbrewery.magiceightball.R.id.askButton;

public class MainActivity extends AppCompatActivity {
    //Use this to log stuff in the LogCat later
    static final String TAG = "Magic8-FH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link to elements in Layout file
        Button myButton = findViewById(askButton);
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        //Create an array holding the image file names
        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        //Detect taps, so a Listener is needed
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Test if the button is linked up correctly
                Log.d(TAG, "Button pressed");

                //Create a random number generator
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                //Test if a number is generated and can be returned
                Log.d(TAG, "The random number is: " + number);

                //Update the image
                ballDisplay.setImageResource(ballArray[number]);
            }
            });
    }
}