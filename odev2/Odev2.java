package com.example.javadersleri.odevler.odev2;

public class Odev2 {


    //Soru 1: parametre olarak girilen kilometreyi mile dönüştüdükten sonra geri döndüren method yazınız.
    public Double MileHesapla(int kacKm) {

        double Mile = kacKm * 0.621;
        return (Mile);

    }

    //Soru 2: Kenarları parametre olarak girilen ve dikdörtgenin alanını hesaplayan bir method yazınız.
    public void AlanHesapla(int a, int b) {
        int Alan = a * b;
        System.out.println("Kenarları girilen Dikdörtgenin Alanı : " + Alan);


    }

    // Soru 3 : Parametre olarak girilen sayısının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız.
    public int FaktoriyelHesapla(int n) {

        int faktoriyel = 1;

        for (int i = 1; i <= n; i++) {
            faktoriyel = faktoriyel * i;

        }

        return faktoriyel;
    }


    // Soru  4 : Parametre olarak girilen kelime içinde kaç adet e harfi olduğunu gösteren metod yazınız.
    public void HarfBul(String kelime){
        char harf ='e';
        int sayac =0;
        char[] dizi=kelime.toCharArray(); //burada parametre olarak alınan String kelime 'yi char türünde bir diziye dönüştürme işlemini yaptım
        for(int i=0;i< kelime.length();i++) //burada kelime uzunluğundan küçük olduğu sürece devam etmesini istediğimden kelime.length() kullandım
        {


            if(dizi[i] == harf){
                sayac++;
            }

        }
        System.out.println("Girilen kelimedeki e harfi sayısı : " + sayac);

    }



    //soru 5 : parametre olarak girilen kenar sayısına göre herbir iç açıyı hesaplayıp sonucu geri döngüderen metodu yazınız

    public float icaciBul(int n) {

        float icaci = (float) ((n - 2) * 180) / n;

        return icaci;

    }


    //Soru 6 : Parametre olarak girilen gün sayısına göre maas hesabı yapan ve elde edilen değeri döndüren metodu yazınız.
    //1 günde 8 sat çalışabilir
    //çalışma saat ücreti 40 tl
    //mesai ücreti 80 tl
    //150 saat üzeri mesai sayılır
    //çözüm :bu bilgilere göre 150 saate kadar calışma saati sayıldığından 40 tl, 150 saatten sonraki her saat mesai saati sayıldığından 80 tl olarak hesaplanması gerekir.

    public int MaasHesapla(int n) {


        int toplamsaat = (n * 8);
        int calisma_ucreti = toplamsaat * 40;//150 saat altındaysa sadece calısma ücreti hesaplanır
        int mesaisaati = toplamsaat - 150;
        if (mesaisaati > 0) {//kişi mesaiye kalmıştır

            int odenecek_mesai = (80 * mesaisaati);
            int odenecek_calisma = 6000; // 150 saate kadar calısma sayıldığından 150*40 (toplam calişma saati * calısma saat ücreti) -> 6000 eder.
            int toplamMaas = odenecek_mesai + odenecek_calisma;

            return toplamMaas;//calısma ücreti +mesai ücreti


        } else {
            return calisma_ucreti; //sadece calısma ücreti
        }

    }

    //Soru 7: Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu yazınız.
    //1 saat =50 tl
    // 1 saat aşımından sonra her 1 saat 10 tl.

    public int OtoparkHesapla(int n) {

        int ilksaat = 50;

        if (n > 1) {
            //toplamsaat = n-1;
            int otopark_ucreti = (10 * (n - 1)) + ilksaat;

            return otopark_ucreti;

        } else {
            return ilksaat;
        }

    }




}

