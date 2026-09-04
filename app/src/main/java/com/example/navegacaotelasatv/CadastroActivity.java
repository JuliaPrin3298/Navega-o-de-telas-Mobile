package com.example.navegacaotelasatv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CadastroActivity extends AppCompatActivity {

    Button btnSalvar;
    TextView txtEmail;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnSalvar = findViewById(R.id.btn_login);
        txtEmail = findViewById(R.id.txt_email);

        btnSalvar.setOnClickListener(v -> {
            Intent intentHome = new Intent(CadastroActivity.this,HomeActivity.class);
            intentHome.putExtra("EMAIL", email);
            startActivity(intentHome);
        });
    }
}