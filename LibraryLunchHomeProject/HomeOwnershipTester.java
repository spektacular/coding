public class HomeOwnershipTester {
    public static void main(String[] args) {
        HomeOwnership ryan = new HomeOwnership(
                new Owner("Ryan Kim", "123-87-3425"),
                new House("343 Louie St Granada Hills CA 91344", 2015));

        HomeOwnership terrance = new HomeOwnership(
                new Owner("Terrance Frank", "289-37-1829"),
                new House("142 Jackson Avenue Northridge CA 91332", 1965));
        System.out.println(ryan.toString());
        System.out.println(terrance.toString());
        System.out.println(ryan.compare(terrance));
    }
}
