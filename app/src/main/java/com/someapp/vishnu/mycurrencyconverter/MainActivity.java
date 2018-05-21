package com.someapp.vishnu.mycurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view) {

        Log.i("Info", "Button Pressed");

        EditText edit = findViewById(R.id.amountEntered);
        String poundString = edit.getText().toString();

        if(poundString.length() == 0) {
            Toast.makeText(this, "Enter a number value before pressing the button",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        for(int i=0; i< poundString.length(); i++) {
            if(!Character.isDigit(poundString.charAt(i))) {
                Toast.makeText(this,
                        "Only enter number values", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        Log.i("Pounds", poundString);

        Double poundValue = Double.parseDouble(poundString);
        Double dollarValue = poundValue*1.35;

        Toast.makeText(this, "£" + poundString + " is $" + dollarValue.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
