package com.deitel.doodlz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityLogin extends AppCompatActivity {

    private EditText et_Usuario;
    private Button btn_Aceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        et_Usuario = findViewById(R.id.editTextUsuario);
        btn_Aceptar = findViewById(R.id.buttonAceptar);
    }

    public void onclicIngresar(View view){
        String usuario = et_Usuario.getText().toString();
        if(usuario.equals("DANIELA")){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            Toast.makeText(this,"Ingreso correcto", Toast.LENGTH_LONG).show();
        }else if(usuario.equals("ESTEFANIA"))
        {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            Toast.makeText(this,"Ingreso correcto", Toast.LENGTH_LONG).show();

        }
        else{
            Toast.makeText(this,"Usuario no registrado", Toast.LENGTH_LONG).show();
        }

    }
}