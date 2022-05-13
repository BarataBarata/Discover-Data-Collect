package com.example.discoverydatacollect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Discover_Login extends AppCompatActivity {
   EditText editTextEmail;
   EditText editTextPassword;
   TextView alerte;
   Button entrar;
    String password="";
    String email="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover_login);

        alerte=findViewById(R.id.alert);
        editTextEmail=findViewById(R.id.email);
        editTextPassword=findViewById(R.id.password);


         entrar=findViewById(R.id.entrar);
         entrar.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {

                 password=editTextPassword.getText().toString();
                 email=editTextEmail.getText().toString();

                 if (email.isEmpty()){
                     editTextEmail.setError("campo vazio");
                 }
                 if (password.isEmpty()){
                     editTextPassword.setError("campo vazio");
                 }

                 if(email.equalsIgnoreCase("123") && password.equalsIgnoreCase("123")){
                     alerte.setText("");
                     startActivity(new Intent(Discover_Login.this,MainActivity.class));

                 }else {
                     editTextPassword.setError("");
                     editTextEmail.setError("");
                     alerte.setText(" email ou password incorreto...");
                 }

             }
         });

    }
}