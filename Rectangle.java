public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        validateDimensions(length, width);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        validateDimension(length);
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        validateDimension(width);
        this.width = width;
    }

    private void validateDimensions(double length, double width) {
        validateDimension(length);
        validateDimension(width);
    }

    private void validateDimension(double dimension) {
        if (dimension < 0) {
            throw new IllegalArgumentException("Dimension must be non-negative");
        }
    }

    public double computeArea() {
        return length * width;
    }
}
