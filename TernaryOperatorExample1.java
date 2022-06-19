package devsought;

public class TernaryOperatorExample1 {

    public static void main(String... args) {
        int score = 50;
        String comment = score >= 50 ? "Pass" : "Fail";
        System.out.println(comment);
        //if...else alternative
        /* String comment;
        if (score >= 50) {
            comment = "Pass";
        } else {
            comment = "Fail";
        }
        System.out.println(comment);*/
    }
}
