package com.example.usuario.miapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buscar por id y obtener el valor
        et1 = (EditText) findViewById(R.id.txt_number);
        et2 = (EditText) findViewById(R.id.txt_numero2);
        tv1 = (TextView) findViewById(R.id.lbl_resultado);


    }

    // metodo que calculara
    public void Sumar(View view){
        int numero1  = Integer.parseInt(et1.getText().toString());
        int numero2  = Integer.parseInt(et2.getText().toString());

        int suma  = numero1 + numero2;
        String resul = String.valueOf(suma);
        tv1.setText(resul);
    }
}
