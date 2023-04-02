import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LonelyInteger {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,1,5,3,1,2,3);
		Map<Object, Long> l1=l.stream()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(l1);
		
		l.stream()
			.collect(Collectors.groupingBy(i -> i,Collectors.counting()))
			.entrySet().stream()
			.filter(e -> e.getValue() == 1)
			.map(e -> e.getKey())
			.findFirst().orElse(0);
		
		Integer lonelyInteger = l.stream()
	            .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
	            .entrySet().stream()
	            .filter(e -> e.getValue() == 1)
	            .map(e -> e.getKey())
	            .findFirst().orElse(null);
		System.out.println(lonelyInteger);
	}

}
