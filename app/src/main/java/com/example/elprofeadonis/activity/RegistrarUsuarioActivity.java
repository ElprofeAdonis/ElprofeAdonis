package com.example.elprofeadonis.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.example.elprofeadonis.R;


import java.io.File;

import de.hdodenhof.circleimageview.CircleImageView;

public class RegistrarUsuarioActivity extends AppCompatActivity {
    private File f;
    private AutoCompleteTextView dropdownTipoDoc, dropdownCanton, dropdownProvincia, dropdownDistrito;
    private CircleImageView imageUser;
    private Button bntSubirImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);
        this.init();

        dropdownTipoDoc = (AutoCompleteTextView) findViewById(R.id.dropdownTipoDoc);
        dropdownCanton = findViewById(R.id.dropdownCanton);
        dropdownProvincia = findViewById(R.id.dropdownProvincia);
        dropdownDistrito = findViewById(R.id.dropdownDistrito);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.tipoDoc, android.R.layout.simple_dropdown_item_1line);
        dropdownTipoDoc.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.Cantón, android.R.layout.simple_dropdown_item_1line);
        dropdownCanton.setAdapter(adapter1);

        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.provincias, android.R.layout.simple_dropdown_item_1line);
        dropdownProvincia.setAdapter(adapter2);

        ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(this,R.array.distritos, android.R.layout.simple_dropdown_item_1line);
        dropdownDistrito.setAdapter(adapter3);

    }

    //subir una imagen de perfil
    private void init(){
        bntSubirImagen = findViewById(R.id.btnSubirImagen);
        imageUser = findViewById(R.id.imageUser);
        bntSubirImagen.setOnClickListener(view -> {
            this.caragarImagen();
        });

    }

    private void caragarImagen() {
        Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        i.setType("image/");
        startActivityForResult(Intent.createChooser(i, "Seleccione la Aplicación"), 10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            Uri uri = data.getData();
            final String realPath = getRealPathFromURI(uri);
            this.f = new File(realPath);
            this.imageUser.setImageURI(uri);
        }
    }

    private String getRealPathFromURI(Uri contentUri) {
        String result;
        Cursor cursor = getContentResolver().query(contentUri, null, null, null, null);
        if (cursor == null) {
            result = contentUri.getPath();
        } else {
            cursor.moveToFirst();
            int idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
            result = cursor.getString(idx);
            cursor.close();
        }
        return result;
    }
}