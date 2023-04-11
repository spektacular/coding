package Horse;

public class HorseTester {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn(new HorseData[] {
                new HorseData("Trigger", 1340),
                null,
                new HorseData("Silver", 1210),
                new HorseData("Lady", 1575),
                null,
                new HorseData("Patches", 1350),
                new HorseData("Duke", 1410)
        });
        System.out.println(barn);
        System.out.println("Duke is in space: " + barn.findHorseSpace("Duke"));
        barn.consolidate();
        System.out.println(barn);
    }
}
