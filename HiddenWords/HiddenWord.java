public class HiddenWord {
    String word;
    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals(this.word.substring(i, i + 1))) {
                result += input.substring(i, i + 1);
            } else if (word.contains("" + input.substring(i, i + 1))) {
                result += "+";
            } else {
                result += "*";
            }
        }
        return result;
    }
}