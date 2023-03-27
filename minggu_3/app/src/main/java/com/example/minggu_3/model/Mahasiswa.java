package com.example.minggu_3.model;

public class Mahasiswa {
    private String nama, npm, noHp;

    public Mahasiswa(String nama, String npm, String noHp) {
        this.nama = nama;
        this.npm = npm;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNpm() {
        return npm;
    }

    public String getNoHp() {
        return noHp;
    }
}
