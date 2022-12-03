// Dosyaya yazi yazdirmayi simule eden bir sinif

public class FilePrinter implements IPrinter {

    @Override
    public void print(String text) {
        System.out.println("Dosyaya yazi yazdiriliyor...");
        System.out.println(text);
    }
}
