package com.example.taufiq.hadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.taufiq.hadits.model.Doa;

public class DetailActivity extends AppCompatActivity {
    TextView namaDoa, ayatDoa, artiDoa;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        namaDoa = (TextView) findViewById(R.id.namaDoa);
        ayatDoa = (TextView) findViewById(R.id.ayatDoa);
        artiDoa = (TextView) findViewById(R.id.artiDoa);

        Doa doa = (Doa) getIntent().getSerializableExtra("id_doa");

        namaDoa.setText(doa.getNama());
        ayatDoa.setText(doa.getSurat());
        artiDoa.setText(doa.getArti());
    }
}
