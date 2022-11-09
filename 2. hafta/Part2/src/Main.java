public class Main {
    public static void main(String[] args) {

        // Array: birden cok degiskei bir arada tutmamiza saglar.

        int[] sayilar = {1, 3, 7, 4, 9, 0}; // direkt dizideki elemanlar tanımlanıyor
        int[] sayilar2 = new int[5]; // 5 elemanlı bir dizi tanimlaniyor.

        System.out.println(sayilar[0]); // indeks degerleri 1'den baslamaz.
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]);
        System.out.println(sayilar[4]);
        System.out.println(sayilar[5]);
        // dizideki tum elemanlar bastiriliyor.


        System.out.println("For dongusu kullanilarak arraydeki elemanlarin bastiriliyor");
        for(int i = 0; i < sayilar.length; i++){
            System.out.println(sayilar[i]);
        }

        System.out.println("Dizideki elemanlari toplami:");
        int sum = 0;
        for(int i = 0; i < sayilar.length; i++){
            sum += sayilar[i];
        }

        System.out.println("Toplam: " + sum + "\n");



        int[][] matris = {{1, 2, 3}, {4, 5, 6}}; // cok boyutlu arrayler
        // matris[0] = {1, 2, 3}
        // matris[1] = {4, 5, 6}
        // matris[1][1] = 5

        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                System.out.println(matris[i][j]);
            }
        }




        // int, long, boolean, char, float vs. // value type
        // int[] reference type


        // Value type degiskenlerde atama yaparken direkt degiskenin degerini degistiririz.
        // Reference type degiskenlerde atama yaparken degiskenin adresini degistiririz.

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];
        

        arr1[3] = 70;
        System.out.println(arr2[3]);
        // arr2'nin adresini arr1'in adres degerine esitledigimiz icin
        // arr1'deki elemanlar degisince arr2'deki elemanlar da degismis oldu.


    }
}