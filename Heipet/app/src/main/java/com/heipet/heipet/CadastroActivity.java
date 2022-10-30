package com.heipet.heipet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getSupportActionBar().hide(); //esconde a barra de cima

    }

    public void addImage(View view){ //adicionar iamgem do tutor
        ImageView imageView = findViewById(R.id.imageView4);
        Toast.makeText(this, "Foto adicionada", Toast.LENGTH_SHORT).show();
    }

    public void cliqueAqui(View view){ //leva pra tela de login
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void entrar(View view){ //acao do botao entrar
        Button button= findViewById(R.id.button);
        ProgressBar progressBar =  findViewById(R.id.progressBar3);
        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(this, "Cadastro realizado", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}