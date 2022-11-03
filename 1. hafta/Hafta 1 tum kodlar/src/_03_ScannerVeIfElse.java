import java.util.Scanner;

public class _03_ScannerVeIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // kullanicidan veri almak icin kullandigimiz nesne

        System.out.println("Bir cumle giriniz:");
        String cumle = scan.nextLine(); // Yeni bir satira gecene kadar yazilan degerleri bu degiskene ata
        System.out.println(cumle);


        System.out.println("final notunuzu giriniz");
        int finalNotu = scan.nextInt(); // kullanicidan tam sayi alana kadar bekle, ardından alinan degeri bu degiskene ata

        boolean bAldiMi = (finalNotu > 70 && finalNotu <= 85);

        // if blogu: sadece parantez icine girdigimiz ifade dogruysa icindeki ifadeyi calistirir.
        if(bAldiMi){
            System.out.println("B aldiniz.");
        }


        System.out.println("tekrar final notunuzu giriniz");
        finalNotu = scan.nextInt(); // kullanıcıdan tam sayi alana kadar bekle, ardından alınan degeri bu degiskene ata
        if(finalNotu > 85){
            System.out.println("A aldınız:");
        }
        // else if: Yukarıdaki if veya else if bloklarından herhangi biri çalışmazsa
        // VE içindeki ifade doğruysa çalışır
        else if(finalNotu > 70 && finalNotu <= 85){
            System.out.println("B aldınız:");
        }
        else if(finalNotu > 55 && finalNotu <= 70){
            System.out.println("C aldınız:");
        }
        else if(finalNotu > 45 && finalNotu <= 55){
            System.out.println("D aldınız:");
        }
        // else: icine bir kosul almaz. Eger ustundeki if ve else if'lerden
        // hicbiri calismazsa calisir.
        else{
            System.out.println("Kaldınız");
        }

    }
}

