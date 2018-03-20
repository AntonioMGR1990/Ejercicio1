package com.example.usuario.ejercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText nombre;
    private EditText apellido;
    private static final String Nombre_INTENT="nombre";
    String valor = "test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.nombreeditText);
        apellido = (EditText)findViewById(R.id.apellidoeditText);
        Button btn = (Button)findViewById(R.id.button3);
        Button btn2 = (Button)findViewById(R.id.reset);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        Toast.makeText(MainActivity.this,"oncreate",Toast.LENGTH_SHORT).show();
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(MainActivity.this,"onstart",Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(MainActivity.this,"onresume",Toast.LENGTH_SHORT).show();
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3:
                Toast.makeText(MainActivity.this,"ok",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                PersonaSingleton.getInstance().setNombre(nombre.getText().toString());
                startActivity(intent);
                return;
            case R.id.reset:
                nombre.setText(valor);
                apellido.setText(null);
                return;
        }
    }
}
