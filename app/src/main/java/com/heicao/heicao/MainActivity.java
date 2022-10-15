package com.heicao.heicao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirPet(View view){
        Intent intent = new Intent(this, PerfilPetActivity.class);
        startActivity(intent);
        finish();
    }
    public void abrirHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void abrirTutor(View view){
        Intent intent = new Intent(this, PerfilTutorActivity.class);
        startActivity(intent);
        finish();
    }

}