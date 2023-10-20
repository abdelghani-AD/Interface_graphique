package com.example.interface_graphique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;
import java.util.HashMap;

public class ScreenMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView nom =  findViewById(R.id.textView4);
        TextView prenom = findViewById(R.id.textView6);
        TextView age = findViewById(R.id.editTextNumber2);
        TextView sexe =  findViewById(R.id.textView8);

        Intent i = getIntent();
        Serializable l = getIntent().getSerializableExtra("data");
        if (l != null){
            HashMap data = (HashMap) l;
            nom.setText("Nom : "+data.get("nom"));
            prenom.setText("Prenom :"+data.get("prenom"));
            age.setText("age :"+data.get("age"));
            sexe.setText("sexe :"+data.get("sexe"));
        }
    }
}