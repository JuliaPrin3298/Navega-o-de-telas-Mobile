package com.example.navegacaotelasatv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txtEmail;
    Button btnLogin, btnCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastro = findViewById(R.id.btn_cadastro);
        btnLogin = findViewById(R.id.btn_login);
        txtEmail = findViewById(R.id.txt_email);

        btnCadastro.setOnClickListener(v -> {
            Intent intentCadastro = new Intent(MainActivity.this, CadastroActivity.class);
            startActivity(intentCadastro);
        });

        btnLogin.setOnClickListener(v -> {
            // MUDANÇA AQUI: Captura o texto atualizado que o utilizador digitou
            String email = txtEmail.getText().toString();

            Intent intentHome = new Intent(MainActivity.this, HomeActivity.class);
            intentHome.putExtra("EMAIL", email);
            startActivity(intentHome);
        });
    }
}
