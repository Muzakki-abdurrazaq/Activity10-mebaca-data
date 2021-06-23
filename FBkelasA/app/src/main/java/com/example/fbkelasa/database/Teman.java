package com.example.fbkelasa.database;

import java.io.Serializable;

public class Teman implements Serializable {
    String kode;
    String nama;
    String telpon;

    public Teman(){
    }

    public Teman(String nama, String telpon) {
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getNama() {

        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getTelpon() {

        return telpon;
    }

    public void setTelpon(String telpon) {

        this.telpon = telpon;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return "Teman{" +
                "nama='" + nama + '\'' +
                ", telpon='" + telpon + '\'' +
                '}';
    }
}