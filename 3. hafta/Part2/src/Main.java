public class Main {

    public static void addNumber(int number){
        // Fonksiyon icinde number degiskeni yeniden olusturuluyor.
        // number degiskeninde yaptigimiz degiskenler k degiskenini etkilemeyecek.
        System.out.print("In addNumber method:");
        number = number + 21;
        System.out.println("Number increased to" + number);
    }
    public static void main(String[] args) {

        int k = 10;
        System.out.println("Value of k: " + k);
        addNumber(k);
        System.out.println(k);


    }
}