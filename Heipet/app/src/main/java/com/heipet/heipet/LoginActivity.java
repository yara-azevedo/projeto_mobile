package com.heipet.heipet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide(); //esconde a barra de cima

    }

    public void cliqueAqui(View view){ //leva pra tela de cadastro
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
        finish();
    }

    public void entrar(View view){ //faz o login e leva pra pagina principal
        Button button= findViewById(R.id.button);
        ProgressBar progressBar =  findViewById(R.id.progressBar3);
        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(this, "Login realizado", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}