import java.util.Scanner;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // switch case:

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int haftaGunu = scan.nextInt();

        // switch(ele alinacak degskenin adi)

        switch (haftaGunu){
            // case elde edilmek istenen durum:
            case 1:{
                System.out.println("Pazartesi");
                //eger bu case icine girilir, ancak case sonuna break; eklenmezse,
                // bir sonraki case'i de calistirir.
                break;
            }
            case 2:{
                System.out.println("Salı");
                break;
            }
            case 3:{
                System.out.println("Çarşamba");
                break;
            }
            case 4:{
                System.out.println("Perşembe");
                break;
            }
            case 5:{
                System.out.println("Cuma");
                break;
            }
            case 6:{
                System.out.println("Cumartesi");
                break;
            }
            case 7:{
                System.out.println("Pazar");
                break;
            }
            // yukaridaki case lerden hicbirine girilmezse calisir.
            default:{
                System.out.println("Geçersiz sayı girdiniz");
            }
        }



        /*
        // Bu ornegi de deneyin
            int yeniHaftaGunu = 3;
                switch (yeniHaftaGunu){
            // case elde edilmek istenen durum
            case 1:{
                System.out.println("Pazartesi");
                break;
            }
            case 2:{
                System.out.println("Salı");
                break;
            }
            case 3:{
                System.out.println("Çarşamba");

            }
            case 4:{
                System.out.println("Perşembe");

            }
            case 5:{
                System.out.println("Cuma");

            }
            case 6:{
                System.out.println("Cumartesi");
                break;
            }
            case 7:{
                System.out.println("Pazar");
                break;
            }
            default:{
                System.out.println("Geçersiz sayı girdiniz");
            }
        }
         */
    }
}
