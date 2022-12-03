public class Circle extends Shape{
    public static final double PI = 3.14;
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
