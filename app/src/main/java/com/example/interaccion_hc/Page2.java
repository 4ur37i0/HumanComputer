package com.example.interaccion_hc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Page2 extends AppCompatActivity implements View.OnClickListener {

    private EditText fnum, snum;
    private Button bSum, bRes, bMul, bDiv;
    private TextView tRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);

        this.fnum = (EditText) findViewById(R.id.fNum);
        this.snum = (EditText) findViewById(R.id.sNum);

        this.bSum = (Button) findViewById(R.id.buttonSum);
        this.bRes = (Button) findViewById(R.id.buttonRest);
        this.bMul = (Button) findViewById(R.id.buttonMult);
        this.bDiv = (Button) findViewById(R.id.buttonDiv);

        this.tRes = (TextView) findViewById(R.id.textResultado);

        this.bSum.setOnClickListener(this);
        this.bRes.setOnClickListener(this);
        this.bDiv.setOnClickListener(this);
        this.bMul.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double fn = Double.parseDouble( this.fnum.getText().toString() );
        double sn = Double.parseDouble( this.snum.getText().toString() );
        double res = 0;

        if (v.getId() == R.id.buttonSum){
            res = fn + sn;

        } else if (v.getId() == R.id.buttonRest) {
            res = fn - sn;

        } else if (v.getId() == R.id.buttonDiv) {
            if(sn != 0){
                res = fn / sn;
            }else {
                this.tRes.setText("No se puede dividir entre 0");
                return;
            }

        }else if (v.getId() == R.id.buttonMult) {
            res = fn * sn;
        }

        this.tRes.setText("Resultado = "+ res);


    }
}