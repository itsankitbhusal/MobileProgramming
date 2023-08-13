package com.example.simpleinterestfragment;

import androidx.fragment.app.Fragment;


import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.annotation.Nullable;

public class SimpleInterestFragment extends DialogFragment {
    EditText etP, etR, etT;
    Button btnCalculate;
    TextView tvResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_layout_for_fragment, container, false);

        etP = view.findViewById(R.id.etP);
        etT = view.findViewById(R.id.etT);
        etR = view.findViewById(R.id.etR);


        btnCalculate = view.findViewById(R.id.btnCalculate);

        tvResult = view.findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p = Integer.parseInt(etP.getText().toString());
                int t = Integer.parseInt(etT.getText().toString());
                int r = Integer.parseInt(etR.getText().toString());

                int si = (p * t * r) / 100;

                tvResult.setText("Result: " + si);
            }
        });
        return view;
    }
}
