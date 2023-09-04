import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String seperator = " ";
        int cnt = Integer.parseInt(bufferedReader.readLine());
        if ( cnt <= 0 || cnt > 100 ) {
            return ;
        }
        Map<String, Integer> numMap = new ConcurrentHashMap<>();
        String[] nums = bufferedReader.readLine().split( seperator );
        for ( String num : nums ) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1 );
        }
        String findNum = bufferedReader.readLine();
        bufferedWriter.write( String.valueOf(numMap.getOrDefault(findNum, 0) ) );
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
