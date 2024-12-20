package com.example.agregadordeinvestimentos.activity;

import static com.example.agregadordeinvestimentos.util.UtilidadesGerais.isValidEmail;
import static com.example.agregadordeinvestimentos.util.UtilidadesGerais.isValidPassword;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.agregadordeinvestimentos.MainActivity;
import com.example.agregadordeinvestimentos.R;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail,editSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        find();
        setOnClicker();
    }

    private void find(){
        editEmail = findViewById(R.id.editTextEmail);
        editSenha = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.buttonLogin);
    }
    private void setOnClicker(){
        editSenha.setInputType(InputType.TYPE_CLASS_NUMBER);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isValidEmail(editEmail)){
                    Snackbar snackbar = Snackbar.make(v,"Email Obrigatorio!",Snackbar.LENGTH_LONG);
                    snackbar.show();
                    return;
                }
                if(!isValidPassword(editSenha)){
                    Snackbar snackbar = Snackbar.make(v,"Email Obrigatorio!",Snackbar.LENGTH_LONG);
                    snackbar.show();
                    return;
                }
                Intent i = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(i);
        finish(); // Fecha LoginActivity
    }



}