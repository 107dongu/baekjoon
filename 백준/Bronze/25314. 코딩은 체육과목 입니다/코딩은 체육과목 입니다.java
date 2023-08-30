import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * long int : 4
         * long long int : 8
         * long long long int : 12
         */
        Scanner scanner = new Scanner(System.in);
        int byteNum = scanner.nextInt();
        String postFix = "int";
        String unitStr = "long";
        String seperateStr = " ";
        String result = "";
        int loopCnt = byteNum / 4;

        while ( loopCnt > 0 ) {
           result += unitStr + seperateStr;
           loopCnt--;
        }
        result += postFix;

        System.out.println( result );
    }
}
