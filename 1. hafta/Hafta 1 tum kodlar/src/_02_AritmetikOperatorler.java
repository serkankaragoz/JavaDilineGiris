public class _02_AritmetikOperatorler {
    public static void main(String[] args) {

        // Aritmetik operatörler

        int sayi1 = 16;
        int sayi2 = 71;
        int toplam = sayi1 + sayi2;
        System.out.println("İki sayinin toplami: " + toplam);

        /*
            + : iki sayiyi veya Stringi biririne eklemek icin kullaniriz.
            - : iki sayiyi birbirinden cikarmak icin kullaniriz
            * : iki sayiyi birbirine carpmak icin kullaniriz
            / : iki sayiyi birbirine bolmek icin kullaniriz
            % : bir sayinin diger sayiya bolumunden kalanini bulmak icin kullaniriz (Mod alma islemi)
            ++ : bir sayinin degerini 1 artirir
            -- : bir sayinin degerini 1 azaltir
         */




        int bolunen = 75;
        int bolen = 6;
        int bolum = bolunen / bolen;
        int kalan = bolunen % bolen;

        System.out.println("bolunen: " + bolunen);
        System.out.println("bolen: " + bolen);
        System.out.println("bolum: " + bolum);
        System.out.println("kalan: " + kalan);

        System.out.println("\n");


        // Casting: bir değişkeni başka bir degisken turu seklinde kullanmaya denir.

        float ondalikliBolum = (float)bolunen / bolen;

        // iki sayinin birbirine bolumunu float deger olarak gostermek istiyorsak
        // iki sayidan en az biri ondalikli sayi olmalidir.

        System.out.println(ondalikliBolum);

        int x1 = 5;
        int x2 = 8;
        int carpimSonucu = x1 * x2;
        System.out.println("x1 * x2 = " + carpimSonucu);

        System.out.println("\n");


        // ++ --

        int sayi = 8;
        // ++ -- Tam sayıyı 1 artırır ya da azaltir
        sayi++; // önce işlemi yapar, sonra 1 artırır.
        ++sayi; // önce 1 artırır, sonra işlemi yapar.


        System.out.println("Sayi: " + sayi);



        sayi2 = 10;
        System.out.println("sayi2: " + sayi2++);
        System.out.println("sayi2: " + sayi2);

        int sayi3 = 10;
        System.out.println("sayi3: " + ++sayi3);
        System.out.println("sayi3: " + sayi3);



        int sayi4 = 5;
        int sonuc = ++sayi4 * ++sayi4;

        System.out.println(sonuc);
        System.out.println("sayi4: " + sayi4);


        // char: 2 byte
        // Karakterleri temsil eder
        // Tek bir karakter alir
        // Stringlerde oldugu gibi "" arasına değil de, '' arasına degeri yazariz.


        System.out.println("\n");

        char harf = 'A';
        System.out.println(harf);

        // (int) parantezinde karakter yazinca ASCII tablosudaki degerini görürüz
        System.out.println((int)harf);

        System.out.println((char)97);


        // boolean veri tipi: Sadece iki deger tutar: true ya da false
        boolean dogru = true;
        boolean yanlis = false;
        System.out.println("True: " + dogru);
        System.out.println("False: " + yanlis);

        // Mantıksal operatörler
        // boolean veri tipi ile temsil edilir


        int finalNotu = 30;
        boolean gectiMi = (finalNotu > 45);
        System.out.println(gectiMi);



        // && And
        // || Or
        // ! Not


        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("\n");


        System.out.println(true || true || false);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("\n");

        System.out.println(!true);
        System.out.println(!false);
    }
}

