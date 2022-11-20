package com.dam.ebdip_devesh_hanumante;

import static com.dam.ebdip_devesh_hanumante.MainActivity5.KEY_STATUS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    TextView tvAct4;
    Button btn_llave;
    Button btn_puerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tvAct4 = findViewById(R.id.tv_Act4);
        String usuario = ((MiApplication) getApplicationContext()).getUsuario();
        tvAct4.setText(String.format(getString(R.string.tvAct4), usuario));

        btn_llave = findViewById(R.id.btn_llave);
        btn_puerta = findViewById(R.id.btn_puerta);

        btn_llave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(i);
            }
        });

        btn_puerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean tieneLlave = getIntent().getBooleanExtra(KEY_STATUS, false);

                if (tieneLlave) {
                    Intent i  = new Intent(MainActivity4.this, MainActivity6.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity4.this, "Ups, tienes que tener la llave para abrir la puerta", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}