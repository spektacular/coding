public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    public String getName() {
        return this.name;
    }

    public int getGradYear() {
        return this.gradYear;
    }

    public boolean getHasGoodStanding() {
        return this.hasGoodStanding;
    }

    public String toString() {
        return this.name + " " + this.gradYear + " " + this.hasGoodStanding;
    }
}
