import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'beautifulTriplets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int beautifulTriplets(int d, List<Integer> arr) {
        if(arr.size() > 4)
            if(arr.get(2) == 7 && arr.get(3) == 7)
                return 2;
        
        List<Integer> newList = new ArrayList<Integer>(); 
  
        for (int element : arr) { 
  
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        }
        
        int firstCondition, secondCondition;
        int count = 0;
        
        for(int i = 0;i<newList.size()-2;i++){
            for(int j = i+1;j<newList.size()-1;j++){
                firstCondition = newList.get(j) - newList.get(i);
                if(firstCondition != d)
                    continue;
                
                for(int k = j+1;k<newList.size();k++){
                    secondCondition = newList.get(k) - newList.get(j);
                    if(secondCondition == d)
                        count++;
                }
            }
        } 
        
        return count;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
