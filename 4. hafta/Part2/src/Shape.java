// Abstract class: Bu siniflarin normal siniflardan farki nesne olusturulamaz
// olmasidir. Bu sinifi miras alan siniflardan nesneler olusturabilmek icin
// govdesiz metodlarin tanimlanmasi gereklidir.

public abstract class Shape {
    private String name;

    public Shape(String name){
        this.name = name;
    }

    abstract double area(); // Seklin alanini donduren metod
    abstract double perimeter(); // Seklin cevresini donduren metod

    public String getName(){
        return this.name;
    }

}
