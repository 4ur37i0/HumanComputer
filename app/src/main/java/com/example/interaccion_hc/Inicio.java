package com.example.interaccion_hc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Inicio  extends AppCompatActivity implements View.OnClickListener {
    private Button b;

    private  Button b1;
    private  Button b2;
    private  Button b3;

    private  TextView t;
    private EditText e;

    private VideoView video;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_inicio);

        this.b1 = (Button) findViewById(R.id.btnV1);
        this.b2 = (Button) findViewById(R.id.btnV2);
        this.b3 = (Button) findViewById(R.id.btnV3);
        this.t = (TextView) findViewById(R.id.textView5);
        this.e =  (EditText) findViewById(R.id.editTextText4);
        this.video =  (VideoView) findViewById(R.id.videoView);

        String videopath = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(videopath);
        video.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        video.setMediaController(mediaController);
        mediaController.setAnchorView(video);
        video.start();

        this.b1.setOnClickListener(this);
        this.b2.setOnClickListener(this);
        this.b3.setOnClickListener(this);


      }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnV1) {
            Log.d("El boton clickeado fue:", "btnV1");
            Intent intent = new Intent(Inicio.this, MainActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.btnV2) {
            Log.d("El boton clickeado fue:", "btnV2");
            Intent intent = new Intent(Inicio.this, Page2.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.btnV3) {
            Log.d("El boton clickeado fue:", "btnV3");
            Intent intent = new Intent(Inicio.this, Page3.class);
            startActivity(intent);
        }




    }
}
