import java.util.ArrayList;

public class TestResults {
    private ArrayList<StudentAnswerSheet> sheets;

    public TestResults(ArrayList<StudentAnswerSheet> sheets) {
        this.sheets = sheets;
    }

    // b)
    public String highestScoringStudent(ArrayList<String> key) {
        StudentAnswerSheet res = this.sheets.get(0);
        for (StudentAnswerSheet s : sheets) {
            if (s.getScore(key) > res.getScore(key))
                res = s;
        }
        return res.getName();
    }
}
