package exercises;

public class Rectangle extends Shape {
    Rectangle(float width, float height) {
        super(width, height);
    }

    @Override
    protected float calculateArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public void printArea() {
        System.out.println("the area of the rectangle is " + this.calculateArea());
    }
}
