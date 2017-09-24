package com.harshmishra.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Random r=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Calculate = (Button) findViewById(R.id.button);
        final EditText name1 = (EditText) findViewById(R.id.editText);
        final EditText name2 = (EditText) findViewById(R.id.editText2);
        final TextView text1 = (TextView) findViewById(R.id.textView5);
        final TextView text2 = (TextView) findViewById(R.id.textView4);
        Calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                int i1=r.nextInt(95);
                text1.setText("Love % between " + name1.getText() + " and " + name2.getText() + " :");
                text2.setText(i1 + "%");




            }
        } );







    }
}
