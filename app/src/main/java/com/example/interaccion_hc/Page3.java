package com.example.interaccion_hc;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page3);

        Thread thread = new Thread(){
            @Override
            public  void run() {

                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(Page3.this, Inicio.class);
                    startActivity(intent);
                }
            }
        }; thread.start();

    }

}