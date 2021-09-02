package com.petshop.fechaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.DatePickerDialog;

import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


    public class MainActivity extends AppCompatActivity {

        Calendar myCalendar = Calendar.getInstance();
        EditText dates;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            dates = (EditText) findViewById(R.id.etDate);
            //Asociamos el método OnClickListener al objeto Date
            dates.setOnClickListener(new View.OnClickListener() {
        @Override

        public void onClick(View view) {
            new DatePickerDialog(MainActivity.this, dat,
                myCalendar.get(Calendar.YEAR),
                myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        }

        DatePickerDialog.OnDateSetListener dat = new DatePickerDialog.OnDateSetListener() {

            @Override
        public void onDateSet(DatePicker view, int year, int month, int day) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, month);
            myCalendar.set(Calendar.DAY_OF_MONTH, day);
            actualizarCampos();
        }
        };
            private void actualizarCampos () {
                String formatoDeFecha = "MM/dd/yy";
                SimpleDateFormat formato = new SimpleDateFormat(formatoDeFecha, Locale.US);
                dates.setText(formato.format(myCalendar.getTime()));
                }

            public void limpiar_Campos(View view) {
                dates.setText("");
            }
        }
