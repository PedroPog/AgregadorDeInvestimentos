package com.example.agregadordeinvestimentos.util;

import android.util.Patterns;
import android.widget.EditText;

import java.util.regex.Pattern;

public class UtilidadesGerais {

    public static boolean isValidEmail(EditText editText){
        String emailInput = editText.getText().toString().trim();
        if(emailInput.isEmpty()){
            editText.setError("O Campo de e-mail esta vazio!");
            return false;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            editText.setError("Por favor, insira um e-mail válido!");
            return false;
        }

        editText.setError(null);
        return true;
    }
    public static boolean isValidPassword(EditText editText){
        int minLength = 6;
        String passwordInput = editText.getText().toString().trim();
        if(passwordInput.isEmpty()){
            editText.setError("O Campo de senha esta vazio!");
            return false;
        }
        if(passwordInput.length()<minLength){
            editText.setError("A Senha deve conter acima de "+minLength+" digitos");
            return false;
        }
        editText.setError(null);
        return true;
    }
}
