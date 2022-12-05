import java.util.*;

public class Main {
    public static void main(String[] args) {
       // Collections

        // Koleksiyonlar birden fazla veri tipini ayni degisken altinda toplamamizi saglar.
        // Her koleksiyonun farkli bir islevi veya veriyi organize etme sekli vardir.

        // ArrayList nesnesi arraylerin gelismis halidir.
        // Arrayler gibi eleman sayisi sabit degildir ve ekleme, cikarma, bir nesnenin varligini
        // sorgulama gibi bircok islevi vardir.
        // Bu metodlari IDE'nizi kurcalayarak veya kaynaklari ve kaynak kodlarini okuyarak gorebilirsiniz.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(-8);

        // For dongusunun gelismis kulanimi.
        for(Integer i : numbers){
            System.out.println(i);
        }

        HashSet<String> words = new HashSet<>();
        // HashSet, matematikteki kumeler ile ayni islevi gorur.
        // Her eleman bir kez eklenebilir. Hizlica bir elamanin var olup olmadigi sorgulansbilir.


        words.add("kalem"); // Eleman ekleme komutu
        words.add("kitap");
        words.add("kalem");
        words.add("balon");



        for(String i : words){
            System.out.println(i);
        }


        System.out.println("farkli kelime sayisi: " +words.size());

        // HashMap, Anahtar ve deger seklinde calisir.
        // Bir anahtar sadece bir degeri temsil edebilir.
        HashMap<String, String> cities = new HashMap<>();

        cities.put("Turkiye", "Ankara"); // Anahtar ve degerleri .put() metoduyla konulur.
        cities.put("Azerbaijan", "Baku");
        cities.put("Ozbekistan", "Taskent");

        cities.put("Turkiye", "Istanbul");
        // Eger ayni anahtar ile ikinci bir ekleme yapilirsa
        // anahtarin sahip oldugu deger guncellenir.



        System.out.println(cities.get("Turkiye")); // Anahtarin degeri .get() metoduyla elde edilir.

        String baskent = cities.get("Gurcistan"); // Eger HashMap icinde var olmayan bir anahtarin degerine ulasmaya calisirsak
        // null deger elde ederiz.
        System.out.println(baskent);


        // Priority Queue'nun iki temel islevi vardir. Eleman eklemek ve en kucuk degeri cikarmak.
        PriorityQueue<Integer> grades = new PriorityQueue<>();
        grades.add(80);
        grades.add(40);
        grades.add(70);
        grades.add(10);

        System.out.println(grades.peek()); // En kocuk degeri Priority Queue'dan cikarmadan kontrol et.

        System.out.println(grades.remove()); // En kocuk degeri Priority Queue'dan cikarir.
        System.out.println(grades.remove());
        System.out.println(grades.remove());
        System.out.println(grades.remove());

    }
}