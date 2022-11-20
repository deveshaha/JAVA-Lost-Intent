package com.dam.ebdip_devesh_hanumante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btnAct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnAct3 = findViewById(R.id.btn_activity3);

        btnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri telefono = Uri.parse("tel: 917407272");
                Intent llamar = new Intent(Intent.ACTION_DIAL, telefono);
                startActivity(llamar);
            }
        });
    }
}