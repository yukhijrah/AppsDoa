package com.example.taufiq.hadits.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.taufiq.hadits.R;

public class DoaHolder extends RecyclerView.ViewHolder {

    public TextView txtNamaDoa;
    public TextView txtArtiDoa;

    public DoaHolder(View itemView) {
        super(itemView);
        txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
        txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);
    }
}
