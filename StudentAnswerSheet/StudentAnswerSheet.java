package StudentAnswerSheet;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StudentAnswerSheet {
    private ArrayList<String> answers;
    private String name;

    public StudentAnswerSheet(ArrayList<String> answers, String name) {
        this.answers = answers;
        this.name = name;
    }

    public double getScore(ArrayList<String> key) {
        // return IntStream.range(0, key.size())
        // .mapToDouble(i -> answers.get(i).equals("?") ? 0 :
        // answers.get(i).equals(key.get(i)) ? 1 : -0.25).sum();
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
