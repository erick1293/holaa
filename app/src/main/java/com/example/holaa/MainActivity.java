package com.example.holaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SizeF;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {

Button btnlogin ; EditText edCorreo, edPass; TextView cCuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llamarbtnlogin();
        llamarCrearCuenta();
    }

    public void llamarbtnlogin(){
        btnlogin = (Button)  findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edCorreo = (EditText) findViewById(R.id.etCorreo);
                edPass = (EditText) findViewById(R.id.etPass);
                  String   correo = edCorreo.getText().toString();
                String   pass = edPass.getText().toString();
                if (correo.equals("admin.admin.cl") && pass.equals("admin")){
                    Toast.makeText(MainActivity.this, "estoy loguiado", Toast.LENGTH_SHORT).show();
               Intent i = new Intent(MainActivity.this , principalActivity.class);
               startActivity(i);

                }else{
                    Toast.makeText(MainActivity.this, "no loguiaste", Toast.LENGTH_SHORT).show();
                }
            }
        });}

        public  void llamarCrearCuenta() {
            cCuenta = (TextView) findViewById(R.id.cCuenta);
            cCuenta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "quiero crear una cuenta", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,crearCuenta.class);
                    startActivity(i);

                }
            });




    }
}
