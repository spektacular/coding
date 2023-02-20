public class House {
    private String address;
    private int yearBuilt;

    public House(String a, int y) {
        address = a;
        yearBuilt = y;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int newYearBuilt) {
        yearBuilt = newYearBuilt;
    }

    public String toString() {
        return address + " " + yearBuilt;
    }

}
