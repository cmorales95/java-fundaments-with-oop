public class Triangle extends Shape {
    Triangle(float base, float height) {
        super(base, height);
    }

    @Override
    protected float calculateArea() {
        return (this.getWidth() * this.getHeight())/2;
    }

    @Override
    public void printArea() {
        System.out.println("the area of the triangle is " + this.calculateArea());
    }
}
