package com.example.interaccion_hc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button entrar;

    private EditText usuario, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        this.entrar = (Button) findViewById(R.id.button);
        this.entrar.setOnClickListener(this);

        this.usuario = (EditText) findViewById(R.id.editTextText2);
        this.pass = (EditText) findViewById(R.id.editTextTextPassword);
    }

    @Override
    public void onClick(View v) {
        String usuario = this.usuario.getText().toString();
        String pass = this.pass.getText().toString();
        if(v.getId() == R.id.button){
            if(usuario.equals("admin")){
                if(pass.equals("password")){
                    this.entrar.setText("Entrar");
                    Intent intent = new Intent(MainActivity.this, Page2.class);
                    startActivity(intent);
                }
                else{
                    this.entrar.setText("Contraseña incorrecta");
                }
            }
            else {
                this.entrar.setText("Usuario no valido");
            }
        }
    }
}