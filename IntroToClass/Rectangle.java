public class Rectangle {
    private int length;
    private int width;
    private double area;

    public Rectangle(int rLength, int rWidth) {
        length = rLength;
        width = rWidth;
        area = rLength * rWidth;
    }

    public String toString() {
        return String.format("l=%d w=%d A=%.2f", length, width, area);
    }
}
