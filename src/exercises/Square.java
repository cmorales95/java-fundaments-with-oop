package exercises;

public class Square extends Shape {
    Square(float size) {
        super(size, 0);
    }

    @Override
    protected float calculateArea() {
        return this.getWidth() * this.getWidth();
    }

    @Override
    public void printArea() {
        System.out.println("the area of the square is " + this.calculateArea());
    }
}
