public class CarRegistrationTester {
	public static void main(String[] args) {
		CarRegistration christopher = new CarRegistration(
				new Owner("Christopher Wong", "123-87-3425"),
				new Car("Porsche", 2015));
		CarRegistration jake = new CarRegistration(
				new Owner("Jake Mattison", "487-37-2345"),
				new Car("BMW", 2012));
		CarRegistration jennifer = new CarRegistration(
				new Owner("Jennifer Kuo", "289-37-1829"),
				new Car("Lexus", 2015));
		System.out.println(christopher);
		System.out.println(jake);
		System.out.println(jennifer);
		System.out.println(christopher.compare(jake));
		System.out.println(jake.compare(jennifer));
	}
}
