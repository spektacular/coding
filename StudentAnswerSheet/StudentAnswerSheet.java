import java.util.ArrayList;

public class StudentAnswerSheet {
    private ArrayList<String> answers;
    private String name;

    public StudentAnswerSheet(ArrayList<String> answers, String name) {
        this.answers = answers;
        this.name = name;
    }

    public double getScore(ArrayList<String> key) {
        double res = 0;
        for (int i = 0; i < key.size(); i++) {
            if (answers.get(i).equals("?"))
                continue;
            if (answers.get(i).equals(key.get(i)))
                res++;
            else
                res += -0.25;
        }
        return res;
    }

    public String getName() {
        return "";
    }

}
