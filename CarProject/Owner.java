public class Owner {
    private String name;
    private String ssn;

    public Owner() {
        name = null;
        ssn = null;
    }

    public Owner(String n, String s) {
        name = n;
        ssn = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String newSsn) {
        ssn = newSsn;
    }

    public String toString() {
        return name + " " + ssn;
    }
}
