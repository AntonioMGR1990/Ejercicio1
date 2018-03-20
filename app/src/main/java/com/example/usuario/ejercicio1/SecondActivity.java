package com.example.usuario.ejercicio1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText direccion;
    private EditText cp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnEnviar =(Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
        direccion = (EditText) findViewById(R.id.Direccion);
        cp = (EditText)findViewById(R.id.CodigoPostal);
    }

    @Override
    public void onClick(View view) {
        Bundle parametros = new Bundle();
        parametros.putString("direccion",direccion.getText().toString());
        parametros.putString("cp",cp.getText().toString());
        Intent intent = new Intent(SecondActivity.this,ActivityFinal.class);
        intent.putExtras(parametros);

        startActivity(intent);

    }
}
