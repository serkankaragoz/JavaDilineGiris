public class VerticalTriangle extends Shape{

    private double base;
    private double height;

    public VerticalTriangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }


    @Override
    double area() {
        return (base * height) / 2;
    }

    @Override
    double perimeter() {
        double hypotenous = Math.sqrt(base*base + height*height);
        return base + height + hypotenous;
    }
}
