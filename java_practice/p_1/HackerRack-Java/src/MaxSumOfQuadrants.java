import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.PrimitiveIterator.OfInt;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//Find Highest Sum of Upper-Left Quadrant of Matrix
//Hacker Rack Flipping Matrix problem

public class MaxSumOfQuadrants {
    public static void main(String[] args) throws IOException {
        

                List<List<Integer>> matrix = new ArrayList<>();
                matrix.add(Arrays.asList(112,42,83,119));
                matrix.add(Arrays.asList(56,125,56,49));
                matrix.add(Arrays.asList(15,70,101,43));
                matrix.add(Arrays.asList(62,98,114,108));

                

                int result = flippingMatrix(matrix);
                System.out.println(result);
      
    }
    public static int flippingMatrix(List<List<Integer>> matrix) {
       /* int sum = 0;
		
		 * int size = matrix.size(); for (int i = 0; i < size/2; i++) { for (int j = 0;
		 * j < size/2; j++) { sum += Math.max( matrix.get(i).get(j), Math.max(
		 * matrix.get(i).get(size-1-j), Math.max( matrix.get(size-1-i).get(j),
		 * matrix.get(size-1-i).get(size-1-j)) ) ); } }
		 */
    	int size = matrix.size();
    	return IntStream.range(0, size/2)
        	.map(i -> IntStream.range(0, size/2)
        			.map(j -> Math.max(matrix.get(i).get(j),
        						Math.max(matrix.get(i).get(size-1-j),
        								Math.max(matrix.get(size-1-i).get(j),matrix.get(size-1-i).get(size-1-j))
        								)
        						)
        				).sum()
        		).sum();
        					
     
    }
}