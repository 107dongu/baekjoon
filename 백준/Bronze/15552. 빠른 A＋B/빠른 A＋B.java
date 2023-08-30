import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCnt = Integer.parseInt( bufferedReader.readLine() );

        while ( loopCnt > 0 ) {
            String line = bufferedReader.readLine();
            String space = " ";
            String[] nums = line.split(space);
            int sum = Integer.parseInt(nums[0] )  + Integer.parseInt( nums[1] );
            bufferedWriter.write( String.valueOf( sum ));
            bufferedWriter.newLine();
           loopCnt--;
        }
        bufferedWriter.flush();
    }
}
