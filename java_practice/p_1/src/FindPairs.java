import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//There is a large pile of socks that must be paired by color. 
//Given an array of integers representing the color of each sock, 
//determine how many pairs of socks with matching colors there are.
//Example
//n=7
//ar=[1,2,1,2,1,3,2]
//There is one pair of color 1 and one of color 2 . 
//There are three odd socks left, one of each color. The number of pairs is 2.
public class FindPairs {
	public static void main(String[] args) {
		//List<Integer> list=Arrays.asList(1,2,1,2,1,3,2);
		List<Integer> list=Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		int n=7;
		System.out.println(sockMerchant(n,list));
		
	}

	private static int sockMerchant(int n, List<Integer> list) {
		
		return list.stream()
				.collect(Collectors.groupingBy(i-> i,Collectors.counting()))
				.entrySet().stream()
					.mapToInt(e -> e.getValue().intValue()/2)
					.sum();
		
		
		
	}
}
