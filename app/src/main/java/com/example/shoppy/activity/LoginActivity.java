package com.example.shoppy.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.shoppy.R;


public class LoginActivity extends AppCompatActivity {

        ImageButton login;
        EditText username,password;



    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.login_relative);
        login = (ImageButton) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.etusername);
        password = (EditText) findViewById(R.id.etpassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password.getText().toString().toUpperCase().equals("TEST1")){
                    login_sukses();
                }else{
                    Toast.makeText(getApplicationContext(),"Salah Password",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent a = new Intent(this,MainActivity.class);
        //mengirim username ke tampilan utama
        a.putExtra("USERNAME",user_login);
        startActivity(a);




    }

}
