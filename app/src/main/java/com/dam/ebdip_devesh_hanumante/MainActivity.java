package com.dam.ebdip_devesh_hanumante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUsuario;
    Button btn_empezar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = findViewById(R.id.et_usrname);
        btn_empezar = findViewById(R.id.btn_empezar);

        btn_empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!etUsuario.getText().toString().isEmpty()){
                    String usuario = etUsuario.getText().toString();
                    ((MiApplication) getApplicationContext()).setUsuario(usuario);

                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(i);
                } else{
                    Toast.makeText(getApplicationContext(),"Debes Introducir un usuario", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}