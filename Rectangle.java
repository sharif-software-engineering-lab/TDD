public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be non-negative");
        }
        this.length = length;
        this.width = width;
    }

    public double computeArea() {
        return length * width;
    }
}
