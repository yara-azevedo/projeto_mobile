package com.heipet.heipet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    BD_helper bd_helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getSupportActionBar().hide(); //esconde a barra de cima

        bd_helper = new BD_helper(this);



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

    public void entrar(View view) { //acao do botao entrar
        EditText nome = findViewById(R.id.et_nome);
        EditText senha2 = findViewById(R.id.et_senha2);
        EditText senha = findViewById(R.id.et_senha);

        Button button = findViewById(R.id.button);
        ProgressBar progressBar = findViewById(R.id.progressBar3);
        progressBar.setVisibility(View.VISIBLE);

        String n = nome.getText().toString();
        String s2 = senha2.getText().toString();
        String s = senha.getText().toString();

        if (TextUtils.isEmpty(n) || TextUtils.isEmpty(s2) || TextUtils.isEmpty(s)) {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        } else {
            if (s.equals(s2)) {
                Boolean checkuser = bd_helper.checkUsername(n);
                if (checkuser == false) {
                    Boolean insert = bd_helper.insertData(n, s);
                    if (insert == true) {
                        Toast.makeText(this, "Cadastro realizado", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(this, LoginActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(this, "errrou", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "usuario ja existe", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "As senhas nao coincidem", Toast.LENGTH_SHORT).show();

            }


        }
    }}