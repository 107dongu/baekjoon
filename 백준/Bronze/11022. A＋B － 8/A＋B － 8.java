import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCnt = Integer.parseInt( bufferedReader.readLine() );
        String prefix = "Case #";
        String midlefix = ": ";
        String seperate = " ";
        String operator = " + ";
        String endOperator = " = ";

        for ( int idx = 1; idx <= loopCnt; idx++ ) {
            String line = bufferedReader.readLine();
            String[] nums = line.split( seperate );
            int sum = Integer.parseInt(nums[0] )  + Integer.parseInt( nums[1] );
            String result =
                    prefix
                    + String.valueOf( idx )
                    + midlefix
                    + nums[0]
                    + operator
                    + nums[1]
                    + endOperator
                    + String.valueOf( sum );
            bufferedWriter.write( result );
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }
}
