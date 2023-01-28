package exercises;

abstract class Shape {
    private final float width;
    private final float height;

    Shape(float width, float height) {
        this.width = width;
        this.height = height;
    }

    protected abstract float calculateArea();

    protected abstract void printArea();

    final float getWidth() {
        return this.width;
    }

    final float getHeight() {
        return this.height;
    }
}
