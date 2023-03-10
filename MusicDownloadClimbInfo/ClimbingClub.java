import java.util.ArrayList;

public class ClimbingClub {
    private ArrayList<ClimbInfo> climbList;

    // 2. Complete this constructor
    public ClimbingClub() {
        this.climbList = new ArrayList<>();
    }

    // 3.
    public void addClimb(String peakName, int climbTime) {
        this.climbList.add(new ClimbInfo(peakName, climbTime));
    }

    // 4.
    public void addClimbOrder(String peakName, int climbTime) {
        ClimbInfo info = new ClimbInfo(peakName, climbTime);
        for (int i = 0; i < this.climbList.size(); i++) {
            if (peakName.compareToIgnoreCase(this.climbList.get(i).getName()) >= 0) {
                this.climbList.add(i, info);
            }
        }
    }

    // 5.
    public int distinctPeakName() {
        ArrayList<String> distinctList = new ArrayList<>();
        for (ClimbInfo info : this.climbList) {
            if (!distinctList.contains(info.getName())) {
                distinctList.add(info.getName());
            }
        }
        return distinctList.size();
    }

    public void printClimbList() {
        for (int i = 0; i < climbList.size(); i++)
            System.out.print(climbList.get(i) + "  ");
    }

}
