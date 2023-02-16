public class Arithmetic {
    private int first;
    private int second;

    public Arithmetic(int firstNum, int secondNum) {
        first = firstNum;
        second = secondNum;
    }

    public int sum() {
        return first + second;
    }

    public int difference() {
        return first - second;
    }

    public int product() {
        return first * second;
    }

    public int average() {
        return (first + second) / 2;
    }
}
