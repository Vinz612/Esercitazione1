package com.example.esercitazione1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name= findViewById(R.id.nome);
        Button b = (Button) findViewById(R.id.pulsante);
        Button invia = (Button) findViewById(R.id.invia);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                Toast t = Toast.makeText(getApplicationContext(), "Hello World! " + n, Toast.LENGTH_SHORT);
                t.show();
            }
        });

        Button b1 = (Button) findViewById(R.id.reset);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
            }
        });

        invia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("chiave", "ciao");
                startActivity(intent);
            }
        });

    }
}
