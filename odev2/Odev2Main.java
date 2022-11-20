package com.example.javadersleri.odevler.odev2;

public class Odev2Main {

    public static void main(String[] args) {

        Odev2 o = new Odev2();

        double mileSonuc = o.MileHesapla(100);
        System.out.println("Girilen Km'nin mile dönüştürülmüş değeri : " +mileSonuc);

        o.AlanHesapla(5,4);

        int faktoriyelSonuc = o.FaktoriyelHesapla(5);
        System.out.println("Girilen Sayının Faktöriyeli : " +faktoriyelSonuc);


        o.HarfBul("elele");

        float icaciSonuc = o.icaciBul(5);
        System.out.println("Girilen Kenar Sayısının Her Bir İçaçısı  : " +icaciSonuc);

        int maasSonuc = o.MaasHesapla(7);
        System.out.println("Toplam Maas Ücreti : " +maasSonuc);

        int otoparkSonuc = o.OtoparkHesapla(5);
        System.out.println("Toplam Otopark Ücreti  : " +otoparkSonuc);


    }


}
