import java.util.Scanner;

public class _01_Degiskenler {
    public static void main(String[] args) {
        // Tek yorum satiri: Kod calistirilirken dikkate alinmaz.
        // İcine kod olan veya olmayan her seyi yazabilirsiniz.
        // Diger programcilarin ve sizin kodu anlamasi icin onem arz etmektedir.

        /*
            Coklu yorum satiri
            Birden cok satiri yorum icine almak icin kullanilir.
        */

/*
         Degisken olusturma:
         degisken_tipi degisken_adi = degiskene atanacak deger ;
         degisken adlari rakam ile baslayamaz ve reserved keyword olamaz.
         Reserved keyword listesi: https://www.thoughtco.com/reserved-words-in-java-2034200
 */



        /*
         String: yazıları belirtmek icin kullandigimiz veri tipidir. " " arasına yazdigimiz
         degerler yazinin icerigini olusturur.
        */

        String
                selam =
                "Merhabalar";
        // her talimatin sonunu belirtmek icin noktalı virgül ; kullaniriz.

        // System.out.println(); terminal ekranina yazi yazdirip sonraki satira gecmek icin kullanilir.
        // System.out.print(); terminal ekranina yazi yazdirir ancak sonraki satira gecmez
        // "\n" stringi sonraki satira gecmek icin kullanilir.
        // "\t" stringi bir tab kadar bosluk birakmamizi saglar

        System.out.println("Hello world!");
        System.out.println(selam);
        System.out.println(selam);
        System.out.println(selam);


        /*
         Sayilari temsil eden degisken tipleri:
         Tam sayilari temsil etmek icin:
         byte, short, int, long
         */

        // Bit: 0 ya da 1
        // Byte : 8 bit (Ornegin  01100010)

        // byte : [ -2^7, 2^7-1 ]
        // short : [ -2^15, 2^15-1 ]
        // int : [ -2^31, 2^31-1 ]
        // long : [ -2^63, 2^63-1 ]
        // arasindaki degerleri tutar.


        int sayi = 75;
        System.out.println(sayi);


        // ondalikli sayilar:
        // float : 4 byte
        // double : 8 byte
        // double, float'a gore daha buyuk bir aralikta daha hassas degerleri tutar.


        float pi = 3.14f;
        System.out.println(pi);


        int tamSayi = 5;
        System.out.println(tamSayi);
        tamSayi = 8;
        System.out.println(tamSayi);

    }
}

