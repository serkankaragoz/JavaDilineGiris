import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Merhaba");
        System.out.println("Serkan");
        // "\n" yeni satıra geçer

        System.out.println("Println olmadan\nyeni satira gectim");

        // "\t" bir tab kadar boşluk birakmaya yarar
        System.out.println("Serkan\tKaragoz");

        int k = 10;
        k += 5;
        System.out.println(k);



        // do while dongusu:
        // kosul saglanmasa bile dongu blogundaki
        // kod bir kez olsun calisir

        k = 0;
        do{
            System.out.println(k);
            k++;
        }while (k < 10);

        // i < 10 kosulu saglanmamasina ragmen kod calisti
        do{
            System.out.println(k);
        }while(k < 10);



        String selam = "Merhaba";
        selam = selam + " Dunya";
        System.out.println(selam);




        System.out.println("\n\n\n");

        // for for(ilk degerler; kosul ; ifade sonuda yapilacak islem)

        for(int j = 0; j < 10; j++){
            System.out.println(j);
        }



        // i = 0
        // i = 1
        // 2, 3, 4



        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        String sifre = "123456";

        Scanner scan = new Scanner(System.in);
        String girilenSifre;

        do{
            System.out.println("Sifrenizi giriniz");
            girilenSifre = scan.nextLine(); // girdigimiz sifre dogru olana kadar (123456)
            // bizden sifre girmemizi isteyecek
        }while (! sifre.equals(girilenSifre));

        System.out.println("Dogru sifre");




        while (true){
            System.out.println("Sifrenizi giriniz");
            girilenSifre = scan.nextLine();
            if(girilenSifre.equals(sifre)){
                break; // break: dongu sirasında karsilasilirsa donguden cikmaya yarar
            }
        }

        System.out.println("Dogru sifre");


        // continue; dongunu basina getirir

        for(int i = 0; i < 30; i++){
            if(i % 2 == 0 || i % 3 != 0){
                continue; // bu ifade calisirsa bu ifadenin altindaki satirlar gormezden gelinir
                // ve dongunun basindan baslanir.
            }
            System.out.println(i);
        }

    }
}