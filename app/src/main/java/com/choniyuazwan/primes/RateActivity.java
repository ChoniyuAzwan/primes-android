package com.choniyuazwan.primes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class RateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);

        getSupportActionBar().setTitle("Determine N Rate Primes");
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

    public void find(View v) {
        boolean test;
        double root;
        String message = "";
        TextView tvFind = (TextView) findViewById(R.id.tvFind);
        EditText etNumber = (EditText) findViewById(R.id.etNumber);
        int quarter = Integer.parseInt(etNumber.getText().toString());
        int primes[] = new int[quarter];
        int number = 1, n = 0;

        while (n != quarter) {
            test = true;
            root = sqrt(number);

            if (number<=1) {
                test = false;
            }

            for (int i=2; i<=root; i++) {
                if (number%i == 0) {
                    test = false;
                }
            }

            if (test == true) {
                primes[n] = number;
                n += 1;
                message = message + number + "\t\t\t";
            }

            number += 1;
        }
        tvFind.setText(message);
    }
}
