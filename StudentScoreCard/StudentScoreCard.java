public class StudentScoreCard {
	private String name;
	private int[] testscores;

	public StudentScoreCard() {
		name = "";
		for (int i = 0; i < testscores.length; i++) {
			testscores[i] = (int) (Math.random() * 101);
		}
	}

	public StudentScoreCard(String n) {
		name = n;
		for (int i = 0; i < testscores.length; i++) {
			testscores[i] = (int) (Math.random() * 101);
		}
	}

	public StudentScoreCard(String n, int[] s) {
		name = n;
		for (int i = 0; i < testscores.length; i++) {
			testscores[i] = s[i];
		}
	}

	public int sum() {
		int s = 0;
		for (int i = 0; i < testscores.length; i++) {
			s += testscores[i];
		}
		return s;
	}

	public double getaverage() {
		return 1.0 * sum() / testscores.length;
	}

	public String toString() {
		return name + " " + getaverage();
	}

	public String printScores() {
		String s = "[ ";
		for (int i = 0; i < testscores.length; i++) {
			s += testscores[i] + ", ";
		}
		return s + " ]";
	}

}