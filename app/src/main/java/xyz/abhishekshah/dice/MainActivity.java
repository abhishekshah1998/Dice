package xyz.abhishekshah.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rolldice;
        rolldice = (Button) findViewById(R.id.rollButton);

        final ImageView leftdice;
        leftdice = (ImageView)findViewById(R.id.image_diceleft);

        final ImageView rightdice;
        rightdice = (ImageView) findViewById(R.id.image_diceright);

        final int[] dicearray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };
        rolldice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomnumbergenerator = new Random();
                int randomnumber1 = randomnumbergenerator.nextInt(6);

                leftdice.setImageResource(dicearray[randomnumber1]);

                int randomnumber2 = randomnumbergenerator.nextInt(6);

                rightdice.setImageResource(dicearray[randomnumber2]);


            }
        });

    }
}
