package com.heipet.heipet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    BD_helper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide(); //esconde a barra de cima
        helper = new BD_helper(this);

    }

    public void cliqueAqui(View view){ //leva pra tela de cadastro
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
        finish();
    }

        public void entrar(View view){ //faz o login e leva pra pagina principal
            EditText nome = findViewById(R.id.et_nome);
            EditText senha = findViewById(R.id.et_senha);
            Button button= findViewById(R.id.button);
            ProgressBar progressBar =  findViewById(R.id.progressBar3);
            progressBar.setVisibility(View.VISIBLE);


            String n = nome.getText().toString();
            String se = senha.getText().toString();

            if( TextUtils.isEmpty(n) || TextUtils.isEmpty(se)) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            } else{
               Boolean checkuserpass = helper.checkUserPass(n,se);
               if(checkuserpass==true){
                   Toast.makeText(this, "Login realizado", Toast.LENGTH_SHORT).show();
                   Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                   startActivity(intent);
                   finish();
               }else{
                   Toast.makeText(this, "errrou", Toast.LENGTH_SHORT).show();
               }
            }



        }
    }
