import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int totalAmt = scanner.nextInt();
        int cnt = scanner.nextInt();
        int calculateTotal = 0;
        while ( cnt > 0 ) {
            int amt = scanner.nextInt();
            int count = scanner.nextInt();

            calculateTotal += amt * count;
            cnt--;
        }
        String result = totalAmt == calculateTotal ? "Yes" : "No";

        System.out.println( result );
    }
}
