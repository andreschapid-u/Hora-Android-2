package edu.unicauca.horaandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnHora;
    private int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHora = this.findViewById(R.id.btnHora);
        btnHora.setOnClickListener(this);
        contador = 0;
        updateTime();
    }

    @Override
    public void onClick(View view) {
        updateTime();
    }

    private void updateTime() {
        contador++;
        String fecha = contador + " "+(new Date()).toString();
        btnHora.setText(fecha);
    }
}