package com.example.nac2_turma2emr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btFaixa =findViewById(R.id.btFaixa);

        btFaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Faixas.class);
                startActivity(intent);
            }
        });
    }

    public void calcularFmc(View view){

        EditText txtIdade = findViewById(R.id.txtIdade);

        String strIdade = txtIdade.getText().toString();

        int idade = Integer.parseInt(strIdade);

        int fmc = 220 - idade;
        Toast.makeText(this, "Sua FMC calculdado é: " + fmc, Toast.LENGTH_SHORT).show();
    }

}
