package com.heipet.heipet;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide(); //esconde a barra de cima

        new Handler().postDelayed(new Runnable() { //seta 3s para direcionar pra proxima tela
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, CadastroActivity.class));
                finish();
            }
        },3000);
    }
}