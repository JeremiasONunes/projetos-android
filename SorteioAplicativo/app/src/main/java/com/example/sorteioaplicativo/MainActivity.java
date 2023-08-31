package com.example.sorteioaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AlterarTexto(View view){

        TextView texto = findViewById(R.id.NumeroSorteio);
        int numeroRandom = 5;
        //instância um objeto da classe Random
        Random random = new Random();
        //gera um valor aleatório qualquer do tipo int
        int valor = random.nextInt(11);
        //imprime o valor gerado na tela
        texto.setText("numero : " +  valor);
    }
}