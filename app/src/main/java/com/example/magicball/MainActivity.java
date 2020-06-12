package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView ball;
    private TextView respuestaDestino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia imagen
        ball = findViewById(R.id.boton);

        //referencia segundo texto
        respuestaDestino = findViewById(R.id.respuesta);

        ball.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, "Buscando tu destino!!", Toast.LENGTH_SHORT).show();

    }


}
