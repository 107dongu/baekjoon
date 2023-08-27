import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        while ( true ) {
           int firstNum = scanner.nextInt();
           int secondNum = scanner.nextInt();
           if ( firstNum == 0 && secondNum == 0 ) {
               break;
           }
            System.out.println( firstNum + secondNum );
        }
    }
}
