public class HomeOwnership {
    private Owner owner;
    private House house;

    public HomeOwnership() {
        owner = null;
        house = null;
    }

    public HomeOwnership(Owner o, House h) {
        owner = o;
        house = h;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner newOwner) {
        owner = newOwner;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House newHouse) {
        house = newHouse;
    }

    public String toString() {
        return owner.getName() + " " + owner.getSsn() + " " + house.getAddress() + " " + house.getYearBuilt();
    }

    public boolean compare(HomeOwnership house) {
        return getHouse().getAddress().equals(house.getHouse().getAddress())
                && getHouse().getYearBuilt() == house.getHouse().getYearBuilt();
    }
}
