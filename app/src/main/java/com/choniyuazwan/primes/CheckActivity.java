package com.choniyuazwan.primes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class CheckActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvResult;
    EditText etNumber;
    private static int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        getSupportActionBar().setTitle("Check Primes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        tvResult = (TextView) findViewById(R.id.tvResult);
        etNumber = (EditText) findViewById(R.id.etNumber);

        Button submit = (Button) findViewById(R.id.btnSubmit);
        submit.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        boolean test;
        double root;
        String strNumber = etNumber.getText().toString();

        if (strNumber.isEmpty() != true) {
            number = Integer.parseInt(strNumber);
        } else {
            number = Integer.parseInt("0");
        }

        if (number > 0) {

            test = true;
            root = sqrt(number);

            if (number <= 1) {
                test = false;
            }

            for (int i=2; i<=root; i++) {
                if (number%i == 0) {
                    test = false;
                }
            }

            if (test == true) {
                tvResult.setText(number + " is primes");
            } else {
                tvResult.setText(number + " is not primes");
            }
        }
    }
}
