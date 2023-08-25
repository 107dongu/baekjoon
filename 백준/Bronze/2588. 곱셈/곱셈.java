import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstOperand = scanner.nextInt();
        String secondOperandStr = scanner.next();
        int thirdStep = firstOperand * Character.getNumericValue(secondOperandStr.charAt(2));
        int forthStep = firstOperand * Character.getNumericValue(secondOperandStr.charAt(1));
        int fifthStep = firstOperand * Character.getNumericValue(secondOperandStr.charAt(0));

        int result = fifthStep * 100 + forthStep * 10 + thirdStep;

        System.out.println(thirdStep);
        System.out.println(forthStep);
        System.out.println(fifthStep);
        System.out.println(result);
    }
}
