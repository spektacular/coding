public class CarRegistration {
    private Owner owner;
    private Car car;

    public CarRegistration() {
        owner = null;
        car = null;
    }

    public CarRegistration(Owner o, Car c) {
        owner = o;
        car = c;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner newOwner) {
        owner = newOwner;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car newCar) {
        car = newCar;
    }

    public String toString() {
        return owner.getName() + " " + owner.getSsn() + " " + car.getModel() + " " + car.getYear();
    }

    public boolean compare(CarRegistration that) {
        return car.getModel().equals(that.getCar().getModel())
                && car.getYear() == that.getCar().getYear();
    }
}
