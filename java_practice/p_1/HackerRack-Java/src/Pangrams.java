import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pangrams {
	public static void main(String[] args) {
		String s="We promptly judged antique ivory buckles for the next prize";
		Set<Character> alp=IntStream.rangeClosed('a', 'z')
							.mapToObj(c -> (char)c)
							.collect(Collectors.toSet());
		Set<Character> alp1= s.replaceAll("\\s", "").toLowerCase().chars()
		.mapToObj(c -> (char)c)
		.filter(c -> Character.isAlphabetic(c))
		.collect(Collectors.toSet());
		System.out.println(alp1);
	}
}
