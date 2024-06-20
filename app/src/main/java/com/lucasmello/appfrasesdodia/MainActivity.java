package com.lucasmello.appfrasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributos da classe

    String[] frases = {
            "Quem cultiva gratidão é capaz de realizar sonhos que parecem inalcançáveis!",
            "Desejar algo maior pra sua vida não significa que você está insatisfeito com o que tem.",
            "A melhor maneira de agradecer por um belo momento é desfrutá-lo plenamente."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);

        int numAleatorio = new Random().nextInt(3);

        String frase = frases[numAleatorio];

        texto.setText(frase);
    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";

        for (String frase : frases) {
          textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);
    }
}