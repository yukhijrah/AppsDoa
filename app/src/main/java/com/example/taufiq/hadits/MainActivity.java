package com.example.taufiq.hadits;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.taufiq.hadits.adapter.DoaAdapter;
import com.example.taufiq.hadits.model.Doa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Doa> doas = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.lst_doa);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doas);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void doaCollections(){
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
        doas.add(new Doa("Masuk Masjid", "arti dari doa masuk masjid", "cari di google"));
    }
}
