package com.example.estudiantes.elboton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ElPrograma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_el_programa);
    }

    public void buscarSalon(View vista) {
        Button boton = (Button) findViewById(R.id.botoncito);
        TextView textico = (TextView) findViewById(R.id.texto);
        EditText editacion = (EditText) findViewById(R.id.editor);
        String salon = editacion.getText().toString();
        if (salon.equals("502") ) { textico.setText("La mejor facultad");
        }else{
            textico.setText("esta en otro salon");
        }
    }
}
