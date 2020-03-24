package com.example.practica_8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String valor1 = extras.getString("Valor1");
        String valor2 = extras.getString("Valor2");
        Toast.makeText(getApplicationContext(), "Valores:\n Valor uno: " +
                valor1 +
                "\n Valor dos: " + valor2, Toast.LENGTH_LONG).show();
        Button button1 = (Button) findViewById(R.id.Button01);
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(i);
            }
        });

    }
}
