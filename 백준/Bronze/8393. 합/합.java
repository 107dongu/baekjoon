import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num * ( num + 1 ) / 2;
        System.out.println(result);
    }
}
