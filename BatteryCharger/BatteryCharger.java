public class BatteryCharger {
    private int[] rateTable;

    public BatteryCharger(int[] rateTable) {
        this.rateTable = rateTable;
    }

    public int getChargingCost(int startHour, int chargeTime) {
        int chargingCost = 0;
        for (int i = 0; i < chargeTime; i++) {
            int currentHour = i + startHour;
            chargingCost += this.rateTable[currentHour % 24];
        }
        return chargingCost;
    }

    public int getChargeStartTime(int chargeTime) {
        int chargeStartTime = this.getChargingCost(0, chargeTime);
        for (int i = 0; i < this.rateTable.length; i++) {
            int cost = this.getChargingCost(i, chargeTime);
            if (cost < chargeStartTime) {
                chargeStartTime = cost;
            }
        }
        return chargeStartTime;
    }
}