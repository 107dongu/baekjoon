import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String seperator = " ";
        String line;

        while ( (line = bufferedReader.readLine() ) != null && !line.isEmpty() ) {
            String[] nums = line.split( seperator );
            int sum = Integer.parseInt( nums[0] ) + Integer.parseInt( nums[1] );
            bufferedWriter.write( String.valueOf( sum ) );
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
}
