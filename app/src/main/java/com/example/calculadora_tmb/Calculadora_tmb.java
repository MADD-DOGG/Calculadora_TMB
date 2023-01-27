package com.example.calculadora_tmb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Calculadora_tmb extends AppCompatActivity {

    private EditText pesoEditText;
    private EditText idadeEditText;
    private EditText alturaEditText;
    private RadioButton masculinoRadioButton;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_tmb);
        getSupportActionBar().hide();

        pesoEditText = findViewById(R.id.peso);
        idadeEditText = findViewById(R.id.idade);
        alturaEditText = findViewById(R.id.altura);
        masculinoRadioButton = findViewById(R.id.masculino);
        resultadoTextView = findViewById(R.id.resultado);
    }

    public void calcularTMB(View view) {
        double peso = Double.parseDouble(pesoEditText.getText().toString());
        int idade = Integer.parseInt(idadeEditText.getText().toString());
        double altura = Double.parseDouble(alturaEditText.getText().toString());

        double tmb;
        if (masculinoRadioButton.isChecked()) {
            tmb = 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * idade) ;
        } else {
            tmb = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.330 * idade) ;
        }

        resultadoTextView.setText(String.format("%.2f", tmb) + " Calorias/Dia");
    }
}