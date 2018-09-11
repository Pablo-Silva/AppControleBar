package com.example.shootingstars.appcontrolebar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText limite, gastos;
    private TextView valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        limite = findViewById(R.id.editTextLimite);
        gastos = findViewById(R.id.editTextGastos);
        valor = findViewById(R.id.textViewAtualiza);
    }

    public  void botaoAtualiza(View view){

        String limite_str = limite.getText().toString();
        String gastos_str = gastos.getText().toString();

        if (view == findViewById(R.id.buttonAtualizar)){

            float limite_number = Float.parseFloat(limite_str);
            float gastos_number = Float.parseFloat(gastos_str);

          if (gastos_number <= limite_number){

              float resultado = limite_number - gastos_number;

              valor.setText(String.valueOf(resultado));
          }

          else{

              valor.setText("Você ultrapassou o limite de " + String.valueOf(limite_number));
          }


        }
    }
}
