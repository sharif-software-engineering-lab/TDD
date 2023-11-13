public class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        validateDimensions(length, width);
        this.length = length;
        this.width = width;
    }

    private void validateDimensions(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be non-negative");
        }
    }

    public double computeArea() {
        return length * width;
    }
}
