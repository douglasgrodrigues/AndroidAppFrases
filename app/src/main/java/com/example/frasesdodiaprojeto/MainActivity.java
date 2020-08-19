package com.example.frasesdodiaprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Que o vento leve o necessário e me traga o suficiente.",
                "Algumas vezes coisas ruins acontecem em nossas vidas para nos colocar na direção das melhores coisas que poderíamos viver.",
                "O sofrimento é passageiro, desistir é pra sempre.",
                "Se a caminhada está difícil, é porque você está no caminho certo.",
                "O machado era de Assis. A rosa, do Guimarães. A bandeira, do Manuel. Mas feliz mesmo era o Jorge, que era amado."
        };

        int numero = new Random().nextInt(5);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }

}
