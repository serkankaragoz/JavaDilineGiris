import paket2.Mathematic;

// Paketler projemizdeki siniflari ve dosyalari siniflandirmamizi saglar.
public class Main {
    public static void main(String[] args) {
        System.out.println(Mathematic.hypotenus(5, 12));
        // Mathematic sinifi baska bir pakette oldugu icin
        // import paket2.Mathematic; yazarak bu paketteki bir sinifi kullancagimizi
        // belirtmemiz gerekir.

    }
}