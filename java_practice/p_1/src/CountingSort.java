import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingSort {
	public static void main(String[] args) {
		List<Integer> ls= Arrays.asList(2,5,68,94,5,6,2,21,456,32,5,68,1);
		countingSort(ls);
	}
	public static void countingSort(List<Integer> arr) {
	    int maxVal = arr.stream().max(Integer::compare).orElse(0);
	    int[] countArr = new int[100];
	    arr.forEach(i -> countArr[i]++);
	    List<Integer> fList=Arrays.stream(countArr).boxed().collect(Collectors.toList());
	    System.out.println(fList);
	}
}
