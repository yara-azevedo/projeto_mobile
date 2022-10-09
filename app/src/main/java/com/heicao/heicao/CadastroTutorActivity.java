package com.heicao.heicao;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class CadastroTutorActivity extends AppCompatActivity {
    ProgressBar progressBar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_tutor);

        getSupportActionBar().hide();

        button = findViewById(R.id.button2);
        progressBar = findViewById(R.id.progressBar2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar = findViewById(R.id.progressBar2);
                progressBar.setVisibility(View.VISIBLE);
                button = findViewById(R.id.button2);
                button.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(CadastroTutorActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}