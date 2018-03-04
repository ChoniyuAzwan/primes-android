package com.choniyuazwan.primes;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Choniyu Azwan on 10-May-16.
 */
public class ComputationFragment extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.computation_layout, container, false);

        Button chekActivity = (Button)myView.findViewById(R.id.btnCheck);
        chekActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CheckActivity.class);
                startActivity(intent);
            }
        });

        Button rateActivity = (Button)myView.findViewById(R.id.btnRate);
        rateActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RateActivity.class);
                startActivity(intent);
            }
        });

        Button intervalActivity = (Button)myView.findViewById(R.id.btnInterval);
        intervalActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), IntervalActivity.class);
                startActivity(intent);
            }
        });

        return myView;
    }
}
