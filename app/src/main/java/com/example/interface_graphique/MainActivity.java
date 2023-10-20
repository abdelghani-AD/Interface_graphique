package com.example.interface_graphique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextNom = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText editTextPrenom = findViewById(R.id.editTextTextEmailAddress2);
        EditText editTextAge = findViewById(R.id.editTextNumber);
        RadioButton radioButtonMal = findViewById(R.id.radioButton);
        RadioButton radioButtonFem = findViewById(R.id.radioButton2);

        Button btn = findViewById(R.id.button5);

        btn.setOnClickListener((view) ->{
        Intent intent = new Intent(this, ScreenMainActivity.class);
        HashMap<String ,String> data = new HashMap<>();
        data.put("nom",editTextNom.getText().toString());
        data.put("prenom",editTextPrenom.getText().toString());
        data.put("age",editTextAge.getText().toString());
        if (radioButtonFem.isChecked() || radioButtonMal.isChecked()){
            if(radioButtonFem.isChecked()==true){
                data.put("sexe",radioButtonFem.getText().toString());
            }
            else{
                data.put("sexe",radioButtonMal.getText().toString());
            }
        }
        intent.putExtra("data",data);
        startActivity(intent);

        });
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String msg = "Hello Ntic DevOAM";
//                int durée = Toast.LENGTH_LONG;
//                Context context = getApplicationContext();
//                Toast toast = Toast.makeText(context,msg,durée);
//                toast.show();
//            }
//        });
    }


//    EditText editTextNom = findViewById(R.id.editTextTextEmailAddress);
//    EditText editTextPrenom = findViewById(R.id.editTextTextEmailAddress2);
//    EditText editTextAge = findViewById(R.id.editTextNumber);
//    RadioButton radioButtonMal = findViewById(R.id.radioButton);
//    RadioButton radioButtonFem = findViewById(R.id.radioButton2);
//    Button btn = findViewById(R.id.button5);
//    public void onclick(View v){
//        Intent intent = new Intent(this,MainActivity2.class);
//        HashMap<String ,String> login = new HashMap<>();
//        login.put("nom : ",editTextNom.getText().toString());
//        login.put("prenom : ",editTextPrenom.getText().toString());
//        login.put("age : ",editTextAge.getText().toString());
//
//        if(radioButtonMal.isChecked() || radioButtonFem.isChecked()){
//            if(radioButtonFem.isChecked()){
//                login.put("sexe : ",radioButtonFem.getText().toString());
//            }
//            else if (radioButtonMal.isChecked()) {
//                login.put("sexe : ",radioButtonMal.getText().toString());
//            }
//        }
//        intent.putExtra("login",login);
//    }
}