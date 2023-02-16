public class Square {
    private int sideLength = 1;
    private double area;
    private double perimeter;

    public Square(int sSideLength) {
        sideLength = sSideLength;
        area = Math.pow(sSideLength, 2);
        perimeter = sSideLength * 4;
    }

    public String toString() {
        return String.format("S=%d A=%.2f P=%.2f", sideLength, area, perimeter);
    }
}
