import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int i = 5;

        Person insan = new Person();
        insan.boy = 194;
        insan.kilo = 70;
        insan.dogumYili = 2002;

        Person baskaInsan = new Person(175, 76, 2009);

        Person person3 = new Person(1977, 179, 71);

        System.out.println("Ilk insan");
        System.out.println(insan.boy);
        System.out.println(insan.kilo);
        System.out.println(insan.dogumYili);

        System.out.println("\nIkınci insan");
        baskaInsan.showInfos();

        System.out.println("\nUcuncu insan");
        person3.showInfos();


    }
}