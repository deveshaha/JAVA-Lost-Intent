package com.dam.ebdip_devesh_hanumante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btnCorto, btnLargo;
    TextView tv_act2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnCorto = findViewById(R.id.btn_corto);
        btnLargo = findViewById(R.id.btn_largo);
        tv_act2 = findViewById(R.id.tv_act2);
        String usuario = ((MiApplication) getApplicationContext()).getUsuario();
        tv_act2.setText(String.format(getString(R.string.tvAct2), usuario));

        btnCorto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(i);
            }
        });

        btnLargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });
    }
}