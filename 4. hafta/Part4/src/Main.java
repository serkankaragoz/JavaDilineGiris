import java.io.IOException;
import java.util.Scanner;

public class Main {

    // Throws anahtar kelimesi bir metodun belirtilen hatayi verme ihtimali oldugu anlamina gelir.
    public static void divide(int bolunen, int bolen) throws ZeroDivisionException {
        if (bolen == 0) {
            throw new ZeroDivisionException("Sifir ile bolunemez");
        }
        int division = bolunen / bolen;
        System.out.println("bolum:" + division);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Boluneni giriniz");
        int bolunen = scanner.nextInt();

        System.out.println("Boleni giriniz");
        int bolen = scanner.nextInt();

        // try blogu icine hata vermesi muhtemel olan kodlarimizi yazariz.
        try {
            System.out.println("Bolum: ");
            divide(bolunen, bolen);
        }
        // catch bloklari icine cikmasi beklenen hatalari
        // ve bu hata meydana gelirse yapilmasi gerekenleri yazariz
        catch (ZeroDivisionException e) {
            e.printStackTrace(); // Hatanin ayrintili mesajlarini yazdirir.
            System.out.println(e);

        }
        // Exception sinifi tum hatalari miras alir.
        // Her hata aslinda bir Exception'dir
        catch (Exception e) {
            System.out.println("Bir hata olustu");
        }
        // Hata meydan gelse de gelmese de finally blogundaki kodlar calisir.
        finally {
            System.out.println("Kod bitti...");
        }


    }
}