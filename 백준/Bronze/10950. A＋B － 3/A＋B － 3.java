import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int count = scanner.nextInt();
        for ( int cnt = 1; cnt <= count; cnt++ ) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            System.out.println( firstNum + secondNum );
        }
    }
}
