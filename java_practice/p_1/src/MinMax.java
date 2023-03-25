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



    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */



public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }

    public static void miniMaxSum(List<Integer> list) {
    	int n = list.size();
    
    	OptionalLong minSum = LongStream.range(0, n)
    			.map(i -> LongStream.range(0, n)
    	        .filter(j -> j != i)
    	        .map(j -> list.get((int) j))
    	        .sum())
    			.min();

    	OptionalLong maxSum = LongStream.range(0, n)
    			.map(i -> LongStream.range(0, n)
    	        .filter(j -> j != i)
    	        .map(j -> list.get((int) j))
    	        .sum())
    			.max();
    	System.out.printf("$d $d",minSum.getAsLong(),maxSum.getAsLong());

    }

}
