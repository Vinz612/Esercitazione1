package com.example.esercitazione1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TerzaActivity extends AppCompatActivity {
Button button;
static final int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terza);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        button = findViewById(R.id.invia);

        String testo = b.getString("chiave");
        TextView etichetta = findViewById(R.id.testo);
        etichetta.setText(testo);

        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        i.putExtra("MESSAGE", "inserire nome");
        setResult(Activity.RESULT_OK, i);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("chiave", "Complimenti sei entrato");
                //startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

    }
}
