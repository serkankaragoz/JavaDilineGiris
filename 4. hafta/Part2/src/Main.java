public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Rectangle rectangle = new Rectangle("Dikdortgen", 10, 5);
        System.out.println("Dikdortgenin alani: " + rectangle.area());
        System.out.println("Dikdortgenin cevresi: " + rectangle.perimeter());
        rectangle.draw();
        System.out.println("\n");

        Square square = new Square("Kare", 9);
        System.out.println("Karenin alani: " + square.area());
        System.out.println("Karenin cevresi: " + square.perimeter());
        square.draw();
        System.out.println("\n");

        System.out.println("Dikdortgen sayisi: " +  Rectangle.getRectangleCount());
        System.out.println("\n");

        Circle circle = new Circle("Daire", 5);
        System.out.println("Dairenin alani: " + circle.area());
        System.out.println("Dairenin cevresi: " + circle.perimeter());
        System.out.println("\n");


        VerticalTriangle verticalTriangle =new VerticalTriangle("Dik ucgen", 5, 12);
        System.out.println("Dik ucgenin alani: " + verticalTriangle.area());
        System.out.println("Dik ucgenin cevresi: " + verticalTriangle.perimeter());
        System.out.println("\n");

    }
}