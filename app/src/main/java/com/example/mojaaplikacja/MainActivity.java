package com.example.mojaaplikacja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int wartosc;
    public int info=0;
    private Switch zmiana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zmiana = findViewById(R.id.switch1);


        Button button = (Button) findViewById(R.id.buttonZw);
        Button button2 = (Button) findViewById(R.id.buttonRe);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info==0) {
                    wartosc++;
                }
                else if(info==1)
                {
                    wartosc--;
                }
                TextView tv1 = (TextView)findViewById(R.id.Wynik);
                tv1.setText(String.valueOf(wartosc));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wartosc=0;
                TextView tv1 = (TextView)findViewById(R.id.Wynik);
                tv1.setText(String.valueOf(wartosc));
            }
        });


        zmiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(zmiana.isChecked())
                {
                    info= 1;
                    Switch nazwa = (Switch) findViewById(R.id.switch1);
                    nazwa.setText("Odejmij");
                }
                else
                {
                    info= 0;
                    Switch nazwa = (Switch) findViewById(R.id.switch1);
                    nazwa.setText("Dodaj");
                }
                TextView tv1 = (TextView)findViewById(R.id.Wynik);
                tv1.setText(String.valueOf(wartosc));
            }
        });

    }
}