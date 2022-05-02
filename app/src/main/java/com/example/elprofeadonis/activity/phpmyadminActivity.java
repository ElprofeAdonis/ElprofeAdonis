package com.example.elprofeadonis.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.elprofeadonis.R;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class phpmyadminActivity extends AppCompatActivity {

    private Button Iniciar;
    private TextView Registrar;

    /*EditText edtUsuario, edtPassword;
    Button btnLogin;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phpmyadmin);

        Registrar = (TextView)findViewById(R.id.txtNuevoUsuario);
        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "si funciono", Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(phpmyadminActivity.this, RegistrarUsuarioActivity.class);
                startActivity(myIntent);
            }
        });

        Iniciar = (Button)findViewById(R.id.btnLogin);

        Iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getBaseContext(), "si funciono", Toast.LENGTH_LONG).show();
                Intent myIntent = new Intent(phpmyadminActivity.this, inicioActivity.class);
                startActivity(myIntent);
            }
        });


        /*edtUsuario = findViewById(R.id.edtUsuario);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);*/

        //evento que realiza toda la estructura de la aplicacion
        /*btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarUsuario( URL"http://localhost/usuario");
            }
        });*/
    }
    @Override
    public void onBackPressed() {
        new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE).setTitleText("has oprimido el botón atrás")
                .setContentText("¿Quieres cerrar la aplicación?")
                .setCancelText("No, Cancelar!").setConfirmText("Sí, Cerrar")
                .showCancelButton(true).setCancelClickListener(sDialog -> {
            sDialog.dismissWithAnimation();
            new SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE).setTitleText("Operación cancelada")
                    .setContentText("No saliste de la app")
                    .show();
        }).setConfirmClickListener(sweetAlertDialog -> {
            sweetAlertDialog.dismissWithAnimation();
            System.exit(0);
        }).show();
    }
    /*public void goToMainn(View v) {
        Intent myIntent = new Intent(this, inicioActivity.class);
        startActivity(myIntent);
    }*/

    // para ir a otra ventana al momento de dar click
    /*public void goToMain(View v) {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }

    // vamos a validar los usuarios

    private void validarUsuario(String URL){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (!response.isEmpty()) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(phpmyadminActivity.this, "usuario o contrasenia incorrecta", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                    Toast.makeText(phpmyadminActivity.this, error.toString(),Toast.LENGTH_SHORT).show();
                }


        }){
            @Override
            protected Map<String, String> getParams() throws  AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("usuario", edtUsuario.getText().toString());
                parametros.put("password", edtPassword.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }*/
}