public class Circle extends Shape{
    public static final double PI = 3.14; // Pi sayisina baska siniflar tarafindan
    // erisim saglanmasi bir sorun olusturmayacagindan public, tum Circle nesneleri icin
    // ayni degeri ifade ettigi icin static ve final olarak tanimladik
    private double radius;

    public Circle(String name, double radius){
        super(name);
        this.radius = radius;
    }


    @Override
    double area() {
        return PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * PI * radius;
    }

}
