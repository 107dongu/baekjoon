import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String scoreStr = "";
        if ( score >= 90 && score <= 100 ) {
            scoreStr = "A";
        } else if ( score >= 80 && score <= 89 ) {
            scoreStr = "B";
        } else if ( score >= 70 && score <= 79 ) {
            scoreStr = "C";
        } else if ( score >= 60 && score <= 69 ) {
            scoreStr = "D";
        } else {
            scoreStr = "F";
        }

        System.out.println(scoreStr);
    }
}
