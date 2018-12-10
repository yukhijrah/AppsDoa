package com.example.taufiq.hadits.model;

import java.io.Serializable;

public class Doa implements Serializable {

    private String nama;
    private String arti;
    private String surat;

    public Doa(String nama, String arti, String surat) {
        this.nama = nama;
        this.arti = arti;
        this.surat = surat;
    }

    public String getNama() {
        return nama;
    }

    public String getArti() {
        return arti;
    }

    public String getSurat() {
        return surat;
    }
}
