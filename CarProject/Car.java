public class Car {
    public String model;
    public int year;

    public Car() {
        model = null;
        year = -1;
    }

    public Car(String m, int y) {
        model = m;
        year = y;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public String toString() {
        return model + " " + year;
    }
}
