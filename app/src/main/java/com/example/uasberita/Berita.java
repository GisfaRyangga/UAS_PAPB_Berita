package com.example.uasberita;

public class Berita {
    private String judul;
    private String kategori;
    private String isi;
    private String key;

    public Berita(){

    }

    public Berita(String judul, String kategori, String isi) {
        this.judul = judul;
        this.kategori = kategori;
        this.isi = isi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
