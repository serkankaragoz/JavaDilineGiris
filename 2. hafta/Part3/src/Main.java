import java.util.Scanner;

public class Main {

    public static void sayHi(){
        System.out.println("Hi");
        System.out.println("Serkan");
    }

    // FInksiyonlarin icinde tanimlanan degiskenlere
    // local variable denir.
    // Fonksiyon icinde tanimlanir ve fonksiyon
    // icinde kullanilir.
    // Baska bir fonksiyonda bulunan degisken isimlerini kullanmama gibi
    // bir zorunlulugu yoktur.
    public static void factorialVoid(){
        System.out.println("Faktoriyeli alinacak sayiyi giriniz:");
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();

        int sonuc = 1;
        while(i > 0){
            sonuc = sonuc * i;
            i--;
        }
        System.out.println(sonuc);

    }

    public static int factorialInt(int i){
        int result = 1;
        while(i > 0){
            result *= i--;
        }
        return result;
    }


    public static void factorialWithParameter(int i){

        int sonuc = 1;
        while(i > 0){
            sonuc = sonuc * i;
            i--;
        }
        System.out.println(sonuc);

    }

    // Recursive fonksiyon:
    // Icinde kendi kendini cagiran fonksiyonlara denir.
    // n! = n * (n-1)! oldugu icin bu esitligi faktoriyel
    // hesaplamak icin kullandik.
    public static int recursiveFactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * recursiveFactorial(n-1);
    }

    public static int digitSum(int number){
        int total = 0;
        int digit;
        while(number > 0){
            digit = number % 10;
            total += digit;
            number /= 10;
        }

        return total;
    }

    public static void arraySum(int[] arr){
        // i: local variable. sadece fonksiyonun icinde kullanilir.
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        System.out.println("Arraydeki degerlerin toplami:" + total);

    }




    public static void main(String[] args) {
        // Fonksiyonlar: istedigimiz zaman calistirabildigimiz kod bloklaridir.
        //
        sayHi();
        factorialVoid(); // parametresiz fonksiyonlar
        factorialWithParameter(8); // parametreli fonksiyonlar

        int[] array = {4, 7, 11, -2};
        arraySum(array); // arraydeki elemanlarin toplamini ekrana yazdiran fonksiyon

        int i = 5;

        int sayi = 123;
        int basamakToplami = digitSum(sayi);
        System.out.println(basamakToplami);

        System.out.println("\n\n");
        System.out.println(digitSum(factorialInt(6)));
        // fonksiyonlarda return tipinin onemi.
        // bir fonksiyonda elde edecegimiz deger baska bir fnksiyonda girdi olarak almamiz gerekebilir.


        System.out.println(digitSum(720));
        System.out.println(9);


        System.out.println(recursiveFactorial(6));

    }
}