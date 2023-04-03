import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.OptionalLong;
import java.util.stream.Stream;

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
