package com.example.esercitazione1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
Button bottone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bottone = findViewById(R.id.button);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        final String testo = bundle.getString("chiave");
        TextView etichetta = findViewById(R.id.benvenuto);
        etichetta.setText(testo);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        Toast t = Toast.makeText(getApplicationContext(), b.getString("chiave"), Toast.LENGTH_SHORT);
        t.show();
        bottone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

                Intent intent = new Intent(getApplicationContext(), TerzaActivity.class);
                intent.putExtra("chiave", "Benvenuto");
                startActivity(intent);
            }
        });


    }

    /*public void sendMessage(View view){
        Intent intent = new Intent(getApplicationContext(), TerzaActivity.class);
        intent.putExtra("chiave", "Benvenuto");
        startActivity(intent);
    }*/
}
