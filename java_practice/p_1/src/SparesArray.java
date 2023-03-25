import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SparesArray {

	public static void main(String[] args) {
		// Count occurrences of queries in strings
		String[] strings={"ab","abc","ab"};
		String[] queries={"ab","abc","bc"};
		
		List<String> sList=Arrays.asList(strings);
		List<String> qList=Arrays.asList(queries);
		
		  List<Integer> counts= qList.stream()
				  .map(q-> (int)sList.stream()
						  .filter(s->  s.equals(q)).count())
				  .collect(Collectors.toList());
		  
        List<Integer> counts1 = Arrays.stream(queries)
                .map(query -> (int) Arrays.stream(strings)
                        .filter(str -> str.equals(query))
                        .count())
                .collect(Collectors.toList());
        
        // Print counts
        counts.forEach(System.out::println);	
        System.out.println(System.getProperty("java.version"));
	}
	
}
