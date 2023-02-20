public class StudentScoreCardTester {
    public static void main(String[] args) {
        int[] score1 = { 77, 84, 79, 90, 100 };
        StudentScoreCard c1 = new StudentScoreCard("Leo", score1);
        System.out.println(c1);
        int[] score2 = { 80, 85, 79, 92, 78 };
        StudentScoreCard c2 = new StudentScoreCard("Anthony", score2);
        System.out.println(c2);
        if (c1.getaverage() > c2.getaverage()) {
            System.out.println("Leo's average score is higher than Anthony's");
        } else if (c1.getaverage() < c2.getaverage()) {
            System.out.println("Anthony's average score is higher than Leo's");
        } else {
            System.out.println("Leo's and Anthony's average scores are the same");
        }
    }
}