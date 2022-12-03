public class Rectangle extends Shape implements Drawable{
    private double base;
    private double height;
    private static int rectangleCount = 0;
    // static olmasaydi Rectangle tipinden
    // olusturulan nesneleri sayamayacaktik.

    public static int getRectangleCount(){
        return rectangleCount;
    }


    public Rectangle(String name, double base, double height){
        super(name);
        this.base = base;
        this.height = height;
        rectangleCount++; // Rectangle tipinden olusan her nesne bu degiskenin degerini 1 artirir.
    }

    @Override
    double area() {
        return base * height;
    }

    @Override
    double perimeter() {
        return 2 * (base + height);
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
