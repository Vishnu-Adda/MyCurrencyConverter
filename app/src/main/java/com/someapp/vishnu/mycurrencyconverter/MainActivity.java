package com.someapp.vishnu.mycurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view) {
        EditText edit = (EditText) findViewById(R.id.amountEntered);

        String poundString = edit.getText().toString();
        double poundValue = Double.parseDouble(poundString);
        Double dollarValue = poundValue*1.35;

        Toast.makeText(this, "£" + poundString + " is $" + dollarValue.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
