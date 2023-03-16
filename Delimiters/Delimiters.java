import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> res = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(this.openDel) || token.equals(this.closeDel)) {
                res.add(token);
            }
        }
        return res;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        for (String del : delimiters) {
            if (del.equals(this.openDel)) {
                openCount++;
            } else {
                openCount--;
            }
            if (openCount < 0)
                return false;
        }
        return openCount == 0;
    }
}
