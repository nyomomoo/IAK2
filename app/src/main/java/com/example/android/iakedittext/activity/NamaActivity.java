package com.example.android.iakedittext.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.iakedittext.R;

public class NamaActivity extends AppCompatActivity {

    private TextView TvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        TvName = (TextView)findViewById(R.id.Tv_name);

        Intent name = getIntent();
        Bundle bundle = name.getExtras();

        if (bundle != null){
            String yourName = (String) bundle.get("Yourname");
            TvName.setText("Hello" + yourName);
        }

    }
}
