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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    	List<Double> result=new ArrayList<Double>();
    	int positiveCount=arr.stream().filter(e -> e.intValue()>0).collect(Collectors.toList()).size();
    	int negativeCount=arr.stream().filter(e -> e.intValue()<0).collect(Collectors.toList()).size();
    	int zeroCount=arr.stream().filter(e -> e.intValue()==0).collect(Collectors.toList()).size();
    	result.add((double) positiveCount / arr.size());
    	result.add((double) negativeCount /arr.size());
    	result.add((double) zeroCount /arr.size());
    	result.stream().forEach( e -> System.out.printf("%.6f \n",e));
    }

}

public class Count {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
