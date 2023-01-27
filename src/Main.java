public class Main {
    public static void main(String[] args) {
        Square square = new Square(2.5F);
        square.printArea();

        Triangle triangle = new Triangle(2F, 3F);
        triangle.printArea();

        Rectangle rectangle = new Rectangle(2F, 3F);
        rectangle.printArea();
    }
}