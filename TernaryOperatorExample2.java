package devsought;

public class TernaryOperatorExample2 {

    public static void main(String... args) {
        int[] scores = new int[]{-2, 60, 22, 91, 40, 79, 86, 102, 44, 72};
        for (int score : scores) {
            System.out.println("Score =" + score + " ,comment =" + comment(score));           
        }
    }

    private static String comment(int score) {
        return score < 0 || score > 100 ? "Invalid score" : score >= 0 && score < 40 ? "Fail" : score >= 40 && score < 50 ? "Average" : score >= 50 && score < 70 ? "Good" : score >= 70 && score < 85 ? "Excellent!" : "Super Great!";
    }

    private static String withIfElse(int score) {
        if (score < 0 || score > 100) {
            return "Invalid score";
        } else if (score >= 0 && score < 40) {
            return "Fail";
        } else if (score >= 40 && score < 50) {
            return "Average";
        } else if (score >= 50 && score < 70) {
            return "Good";
        } else if (score >= 70 && score < 85) {
            return "Excellent!";
        } else {
            return "Super Great!";
        }
    }

}
