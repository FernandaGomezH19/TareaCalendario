package com.petShop.mascota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView pagoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        impresion_pantalla();
    }

    private void impresion_pantalla(){
        Bundle recoge_datos = getIntent().getExtras();
        double pago = recoge_datos.getDouble("pago");

        pagoResultado = (TextView)findViewById(R.id.tvResultado);
        pagoResultado.setText(pago + "");
    }
}