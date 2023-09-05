import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = bufferedReader.readLine();
        String seperator = " ";
        int cnt = Integer.parseInt(line);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        String secondLine = bufferedReader.readLine();
        for( String num : secondLine.split(seperator) ) {
            int val = Integer.parseInt( num );
            min = min == Integer.MIN_VALUE ? val : Math.min(val, min);
            max = max == Integer.MAX_VALUE ? val : Math.max(val, max);
        }

        bufferedWriter.write(  min + seperator + max );
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
