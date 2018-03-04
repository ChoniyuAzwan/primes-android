package com.choniyuazwan.primes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class IntervalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval);

        getSupportActionBar().setTitle("Determine Primes With Interval");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // API 5+ solution
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //finish();
    }

    public void range(View v) {
        boolean test;
        double root;
        String message = "";
        TextView tvRange = (TextView) findViewById(R.id.tvRange);

        EditText etUp = (EditText) findViewById(R.id.etUp);
        int up = Integer.parseInt(etUp.getText().toString());

        EditText etDown = (EditText) findViewById(R.id.etDown);
        int down = Integer.parseInt(etDown.getText().toString());

        for (int number=down; number<=up; number++) {
            test = true;
            root = sqrt(number);

            if (number <=1) {
                test = false;
            }

            for(int i=2; i<=root; i++) {
                if (number%i == 0) {
                    test = false;
                }
            }

            if (test == true) {
                message = message + (number + "\t\t\t");
            }
        }
        tvRange.setText(message);
    }
}
