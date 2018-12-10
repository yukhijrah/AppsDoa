package com.example.taufiq.hadits.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.taufiq.hadits.DetailActivity;
import com.example.taufiq.hadits.R;
import com.example.taufiq.hadits.model.Doa;
import com.example.taufiq.hadits.viewholder.DoaHolder;

import java.util.ArrayList;
import java.util.List;

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas = new ArrayList<>();

    public DoaAdapter(List<Doa> doas) {
        this.doas = doas;
    }

    @NonNull
    @Override
    public DoaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemVew = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_doa, parent, false);

        final DoaHolder doaHolder = new DoaHolder(itemVew);

        doaHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = doaHolder.getAdapterPosition();
                Intent intent = new Intent(doaHolder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("id_doa", doas.get(position));

                doaHolder.itemView.getContext().startActivity(intent);
            }
        });
        return doaHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoaHolder holder, int position) {
        final Doa doa = doas.get(position);
        holder.txtNamaDoa.setText(doa.getNama());
        holder.txtArtiDoa.setText(doa.getArti());
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}
