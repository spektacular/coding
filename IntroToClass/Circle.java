public class Circle {
    private int radius;
    private double area
    private double circumference;

    public Circle(int cRadius) {
        radius = cRadius;
        area = Math.PI * Math.pow(cRadius, 2);
        circumference = 2 * Math.PI * cRadius;
    }

    public String toString() {
        return String.format("r=%d C=%.2f A=%.2f", radius, circumference, area);
    }
}
