package com.example.padariamercadinhofreire;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPrincipal extends AppCompatActivity {
    private AppCompatButton button_back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        IniciarComponentes();

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(TelaPrincipal.this,FormLogin.class);
                startActivity(intent);
            }
        });
    }

    private void IniciarComponentes(){
        button_back =findViewById(R.id.button_voltar);
    }
}