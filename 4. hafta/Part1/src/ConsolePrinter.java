// Konsol ekranina yazi yazdirmayi simule eden bir sinif

// Sinifimizin sahip olmasini istedigimiz davranislari Interfaceleri kullanarak gosteririz.

// Interface(ler)i implement eden bir siniftan nesne olusturmak icin
// o sinif icerisinde interfacelerin tum metodlarini tanimlamamiz gerekir.

// Interfaceleri implements anahtar kelimesiyle sinifimiza ekleriz ve bir sinif birden fazla interface'i implement edebilir.
public class ConsolePrinter implements IPrinter{


    @Override
    public void print(String text) {
        System.out.println("Konsola yazi yazdiriliyor...");
        System.out.println(text);
    }


}
