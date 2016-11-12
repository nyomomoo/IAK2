package com.example.android.iakedittext;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.iakedittext.activity.MovieActivity;
import com.example.android.iakedittext.activity.NamaActivity;

public class MainActivity extends AppCompatActivity {

    private EditText TvEditText;
    private Button btnKlik, btnStartActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TvEditText = (EditText) findViewById(R.id.Tv_editText);
        btnKlik = (Button) findViewById(R.id.btn_klik);
        btnStartActivity = (Button) findViewById(R.id.btn_startactivity);

        final String name = TvEditText.getText().toString();

        btnKlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cekName = new Intent(MainActivity.this, NamaActivity.class);
                cekName.putExtra("Yourname", TvEditText.getText().toString());
                startActivity(cekName);
            }
        });

        btnStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MovieActivity.class));
                finish();
            }
        });
    }
};
