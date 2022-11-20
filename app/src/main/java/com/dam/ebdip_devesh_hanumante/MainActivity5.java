package com.dam.ebdip_devesh_hanumante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    public boolean llave = false;
    public static final String KEY_STATUS = "llave";

    Button btn_llave;
    Button btn_sin_llave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn_llave = findViewById(R.id.btn_volver_con_llave);
        btn_sin_llave = findViewById(R.id.btn_volverSinLlave);

        btn_llave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5.this, MainActivity4.class);
                i.putExtra(KEY_STATUS, true);
                startActivity(i);
            }
        });

        btn_sin_llave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(i);
            }
        });

    }

}