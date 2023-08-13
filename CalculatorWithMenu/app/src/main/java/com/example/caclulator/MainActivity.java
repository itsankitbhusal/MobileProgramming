package com.example.caclulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btShowCalc;
    EditText etNum1, etNum2;
    TextView tvResult;
    PopupMenu operationsPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btShowCalc = findViewById(R.id.btShowCalc);

        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        tvResult = findViewById(R.id.tvResult);

        btShowCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(MainActivity.this, view);
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
//
                        int num1 = Integer.parseInt(etNum1.getText().toString());
                        int num2 = Integer.parseInt(etNum2.getText().toString());
                        switch (item.getItemId()) {
                            case R.id.add:
                                int sum = num1 + num2;
                                tvResult.setText("Result: " + sum);
                                break;
                            case R.id.subtract:
                                int diff = num1 - num2;
                                tvResult.setText("Result: " + diff);
                                break;
                            case R.id.multiply:
                                tvResult.setText("Result: " + (num1 * num2));
                                break;
                            case R.id.divide:
                                tvResult.setText("Result: " + (num1 / num2));
                                break;
                        }

                        return true;
                    }
                });
                popup.inflate(R.menu.menu);
                popup.show();

            }
        });
    }

}