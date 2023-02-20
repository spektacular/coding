public class BatteryChargerTester {
    public static void main(String[] args) {
        int[] rate = { 50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60 };
        BatteryCharger b = new BatteryCharger(rate);
        System.out.println("$" + b.getChargingCost(12, 1));
        System.out.println("$" + b.getChargingCost(0, 2));
        System.out.println("$" + b.getChargingCost(22, 7));
        System.out.println("$" + b.getChargingCost(22, 30));
    }
}