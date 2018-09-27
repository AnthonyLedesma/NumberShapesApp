package com.app.aledesma.numbershapesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        class GivenNumber {
            int x;

            boolean isPerfectSquare(double x) {

                // Find floating point value of
                // square root of x.
                double sr = Math.sqrt(x);

                // If square root is an integer
                return ((sr - Math.floor(sr)) == 0);
            }

            boolean isTriangularNumber(long num) {
                long calc_num = 8 * num + 1;
                long t = (long) Math.sqrt(calc_num);
                if (t * t == calc_num) {
                    return true;
                }
                return false;
            }
        }


            public void checkNum(View view){
                EditText userInput = (EditText) findViewById(R.id.UserInput);
                String output;
                if (userInput.getText().toString().isEmpty()) {
                    output = "Please enter a whole number";
                } else {

                    GivenNumber anthony = new GivenNumber();
                    anthony.x = Integer.parseInt(userInput.getText().toString());

                    output = String.format(
                            "You entered the number %d. It is %s that the number is a perfect square and it is %s that the number is a triangular number",
                            anthony.x, anthony.isPerfectSquare(anthony.x), anthony.isTriangularNumber(anthony.x));
                }
                Toast.makeText(this, output, Toast.LENGTH_SHORT).show();
            }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
