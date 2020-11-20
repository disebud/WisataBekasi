package com.disebud.wisatabekasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wisataSatu(View view) {
        Intent i = new Intent(MainActivity.this,WisataSatu.class);
        startActivity(i);
    }

    public void wisataDua(View view) {
        Intent ii = new Intent(MainActivity.this,WisataDua.class);
        startActivity(ii);
    }

    public void wisataTiga(View view) {
        Intent iii = new Intent(MainActivity.this,WisataTiga.class);
        startActivity(iii);
    }
}