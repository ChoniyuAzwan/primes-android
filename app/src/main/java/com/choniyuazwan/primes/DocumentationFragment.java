package com.choniyuazwan.primes;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Choniyu Azwan on 10-May-16.
 */
public class DocumentationFragment extends Fragment {
    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.documentation_layout, container, false);

        Button definitonActivity = (Button)myView.findViewById(R.id.btnDefinition);
        definitonActivity .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DefinitionActivity.class);
                startActivity(intent);
            }
        });

        Button historyActivity = (Button)myView.findViewById(R.id.btnHistory);
        historyActivity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HistoryActivity.class);
                startActivity(intent);
            }
        });

        Button theoremdActivity = (Button)myView.findViewById(R.id.btnTheorem);
        theoremdActivity  .setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TheoremActivity.class);
                startActivity(intent);
            }
        });

        Button NewsActivity = (Button)myView.findViewById(R.id.btnNews);
        NewsActivity .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NewsActivity.class);
                startActivity(intent);
            }
        });

        return myView;
    }
}
