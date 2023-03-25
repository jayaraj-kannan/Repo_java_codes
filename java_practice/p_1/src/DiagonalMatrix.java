import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalMatrix {
public static void main(String[] args) {
	List<List<Integer>> arr = new ArrayList<>();
	arr.add(Arrays.asList(1, 2, 3 ,4));
	arr.add(Arrays.asList(4, 5, 6 , 7));
	arr.add(Arrays.asList(7, 8, 9 , 10));
	arr.add(Arrays.asList(7, 8, 9 , 10));
	
	int dia1= IntStream.range(0, arr.size())
				.map(i -> {
					System.out.println("i==>"+i);
					System.out.println("arr==>"+arr.get(i).get(i));
					return arr.get(i).get(i);
				}).sum();
	int dai2= IntStream.range(0, arr.size())
				.map(i ->{
				return	arr.get(i).get(arr.size()-1 -i);
				}).sum();
	System.out.println(dai2);
}
}
