package com.example.usuario.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityFinal extends AppCompatActivity implements View.OnClickListener {

    private EditText direccionfinal;
    private EditText cpfinal;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent intent = getIntent();
        Bundle parametros = this.getIntent().getExtras();
        String direccion=parametros.getString("direccion");
        String cp=parametros.getString("cp");
        direccionfinal = (EditText)findViewById(R.id.DireccionFinal);
        cpfinal = (EditText)findViewById(R.id.CpFinal);
        direccionfinal.setText(direccion);
        cpfinal.setText(cp);
        btn = (Button)findViewById(R.id.Terminar);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.finish();
    }
}
