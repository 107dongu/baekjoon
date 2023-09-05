import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = bufferedReader.readLine();
        String seperator = " ";
        String[] conditions = line.split(seperator);
        int cnt = Integer.parseInt( conditions[0] );
        int maxNum = Integer.parseInt( conditions[1] );
        if ( ( cnt < 1 || 10000 < cnt ) || ( maxNum < 1 || maxNum > 10000 ) ) {
            bufferedWriter.close();
            return;
        }

        String[] nums = bufferedReader.readLine().split(seperator);
        List<Integer> numList = new ArrayList<>();
        for( String num : nums ) {
            int number = Integer.parseInt(num);
            if ( number < maxNum ) {
              numList.add( number );
           }
        }
        String result = "";
        for ( int i = 0; i < numList.size(); i++ ) {
            result += String.valueOf(numList.get(i));
            if ( i != numList.size() - 1 ) {
                result += seperator;
            }
        }
        bufferedWriter.write( result );
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
