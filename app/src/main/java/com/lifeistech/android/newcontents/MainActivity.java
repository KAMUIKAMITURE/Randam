package com.lifeistech.android.newcontents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int count;
    TextView textView;
    int number;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById (R.id.textView);
        count = 0;



}
    public void add (View v) {
        number = random.nextInt(100);

        if (number < 50){
            count = count+50;
            textView.setText(String.valueOf(count));
        }else {
            count = count-50;
            textView.setText(String.valueOf(count));
        }

    }

}
