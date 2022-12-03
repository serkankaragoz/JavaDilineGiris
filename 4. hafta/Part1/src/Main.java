import java.io.*;
public class Main {

    // Eger interfaceleri kullanmadan yazi yazdirmayi simule eden bir
    // kod yazmayi deneseydik kodumuzun bakimi her yeni ozellik eklememiz
    // gerektiginde zorlasacakti ve guvenli olmayacakti

    // Bu sekilde kodlar YAZMAYIN
    public static void print(String printType, String text){
        if(printType.equals("Console")){
            System.out.println("Konsola yazi yazdiriliyor...");
            System.out.println(text);
        }
        else if(printType.equals("File")){
            System.out.println("Dosyaya yazi yazdiriliyor...");
            System.out.println(text);
        }
    }


    public static void main(String[] args) {
        // Projede konsol ekranina veya dosyaya yazi yazdirmayi simule eden iki sinif bulunuyor.

        System.out.println(IPrinter.PI);

        System.out.println("Hello world!");
        ConsolePrinter cp = new ConsolePrinter();
        FilePrinter fp = new FilePrinter();



        cp.print("Serkan");
        System.out.println("\n");
        fp.print("Karagoz");

        System.out.println("\n");

        Implementer implementer = new Implementer();
        implementer.superMethod();
        implementer.superMethod2();
        implementer.subMethod();


    }
}