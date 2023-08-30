import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 같은 눈 3개 : 10,000 + 눈 * 1,000
         * 같은 눈 2개 : 1,000 + 눈 * 100
         * 모두 다른 눈 : 가능 큰 눈 * 100
         */
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int sum = 0;

        if ( first == second && second == third ) {
            sum = 10000 + first * 1000;
        } else if ( first == second ) {
            sum = 1000 + first * 100;
        } else if ( second == third ) {
            sum = 1000 + second * 100;
        } else if ( first == third ) {
            sum = 1000 + first * 100;
        } else {
            int max = Math.max( first, second );
            max = Math.max( max, third );
            sum = max * 100;
        }

        System.out.println( sum );
    }
}
