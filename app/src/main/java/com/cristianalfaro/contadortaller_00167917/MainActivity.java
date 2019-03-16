package com.cristianalfaro.contadortaller_00167917;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button in, out;
    private TextView textIn, textOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        in = findViewById(R.id.buttonIn);
        textIn = findViewById(R.id.textIn);
        in.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int cont = Integer.parseInt(textIn.getText().toString());
                cont += 1;
                textIn.setText(""+cont);

            }
        });

        out = findViewById(R.id.buttonOut);
        textOut = findViewById(R.id.textOut);
        out.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int cont = Integer.parseInt(textOut.getText().toString());
                cont += 1;
                textOut.setText(""+cont);

            }
        });
    }
}
