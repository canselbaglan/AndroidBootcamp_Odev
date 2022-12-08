package com.example.hesapmakinesiuygulamasi;

import java.io.Serializable;

public class Sayi implements  Serializable {
private int sayi1;
private  int sayi2;

    public Sayi() {
    }


    public Sayi(int sayi1, int sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }


    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }
}
