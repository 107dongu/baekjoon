import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCnt = Integer.parseInt( bufferedReader.readLine() );
        String star = "*";
        String space = " ";

        for ( int idx = 1; idx <= loopCnt; idx++ ) {
            int starLoop = idx;
            int spaceLoop = loopCnt - idx;
            while ( spaceLoop > 0 ) {
                bufferedWriter.write( space );
                spaceLoop--;
            }
            while ( starLoop > 0 ) {
                bufferedWriter.write( star );
                starLoop--;
            }
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
    }
}
