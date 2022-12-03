

// Interface: Icınde govdesiz metodlar butununu bulunduran, bir sinifin
// davranislarini gosteren sanal veri tipleridir.
// Siniflar interface'leri implement ederler.
public interface IPrinter extends Cloneable{
    void print(String text);

    // Interfacelere degisken eklemek mumkundur ancak sonrada degistirilemezler
    float PI = 3.1415f;

    // Interfacelere govdeli metod eklemek de mumkundur. Bunun icin metodun
    // basina default anahtar kelimesini yazmak yeterlidir. Bu metodlar override edilebilir.
    default String hello(){
        return "Hello world";
    }

}
