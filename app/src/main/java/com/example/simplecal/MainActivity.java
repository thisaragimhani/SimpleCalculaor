package com.example.simplecal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonAdd(View v){
        EditText edt1 = (EditText)findViewById(R.id.editText1);
        EditText edt2 = (EditText)findViewById(R.id.editText2);

        TextView t1 = (TextView)findViewById(R.id.textView);

        int number1 = Integer.parseInt(edt1.getText().toString());
        int number2 = Integer.parseInt(edt2.getText().toString());

        int sum = number1 + number2;

        t1.setText(Integer.toString(sum));
    }

    public void onButtonDiv(View v){
        EditText edt1 = (EditText)findViewById(R.id.editText1);
        EditText edt2 = (EditText)findViewById(R.id.editText2);

        TextView t1 = (TextView)findViewById(R.id.textView);

        int number1 = Integer.parseInt(edt1.getText().toString());
        int number2 = Integer.parseInt(edt2.getText().toString());

        int div = number1 / number2;

        t1.setText(Integer.toString(div));

    }

    public void onButtonSub(View v){
        EditText edt1 = (EditText)findViewById(R.id.editText1);
        EditText edt2 = (EditText)findViewById(R.id.editText2);

        TextView t1 = (TextView)findViewById(R.id.textView);

        int number1 = Integer.parseInt(edt1.getText().toString());
        int number2 = Integer.parseInt(edt2.getText().toString());

        int sub = number1 - number2;

        t1.setText(Integer.toString(sub));
    }

    public void onButtonMult(View v){
        EditText edt1 = (EditText)findViewById(R.id.editText1);
        EditText edt2 = (EditText)findViewById(R.id.editText2);

        TextView t1 = (TextView)findViewById(R.id.textView);

        int number1 = Integer.parseInt(edt1.getText().toString());
        int number2 = Integer.parseInt(edt2.getText().toString());

        int mult = number1 * number2;

        t1.setText(Integer.toString(mult));
    }

}
