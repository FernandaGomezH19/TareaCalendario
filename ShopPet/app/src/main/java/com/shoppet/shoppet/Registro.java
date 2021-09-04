package com.petShop.mascota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Registro extends AppCompatActivity {

    private EditText etNomMascota;
    private RadioButton rbPerro;
    private RadioButton rbGato;
    private Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        //Comunicaciòn o busqueda de componentes, relaciòn entre la parte lògica con la
        //parte gràfica

        etNomMascota = (EditText)findViewById(R.id.etNomMascota);
        rbPerro = (RadioButton)findViewById(R.id.rbPerro);
        rbGato = (RadioButton)findViewById(R.id.rbGato);
    }

    public void total_pago (View view){
        String nombre = etNomMascota.getText().toString();
        String tipoM ;

        if(rbPerro.isChecked() == true)
            tipoM = "perro";
        else
            tipoM = "gato";

        Mascota m1 = new Mascota(nombre,tipoM);
        double pago = m1.pago();

        Intent resultado_pago = new Intent(this, Resultado.class);
        resultado_pago.putExtra("pago", pago);
        startActivity(resultado_pago);
    }
}