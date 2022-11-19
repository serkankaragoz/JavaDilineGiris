public class Main {
    public static void main(String[] args) {


        Person person = new Person();
        person.setAge(45);
        person.setName("Hakan");


        System.out.println("Insanin yasi: " + person.getAge());
        System.out.println("Insanin adi: " + person.getName());

        person.setAge(-7); // Deger degistime islemi basarisiz olacak unku setAge metodumuzun icine
        // yasin 0'dan kucuk girilmesini engelleyen bir kosul yazdik.

        Person person1 = new Person(15, "Serkan", 1.50, 74);
        Person person2 = new Person(10, "Hakan", 1.70, 80);



        String isim = "Serkan"; // Bellekte Serkan ismi olustu
        String digerIsim = "Serkan"; // Bellekte hali hazirda Serkan degeri bulundugu icin ayni yerleri gosterirler.
        // Stringleri bu sekilde olusturursak bellekte ayni yeri isaret ederler.

        System.out.println(isim == digerIsim); // == operatörü : referans degerlerini karsilastirir

        String ucuncuIsim = new String("Serkan"); // Eger Stringimizi bu sekilde tanimlarsak
        // bellekte yeni bir alanda olusmus olacak.

        System.out.println(isim == ucuncuIsim); // false
        System.out.println(isim.equals(ucuncuIsim)); // true


    }
    
}