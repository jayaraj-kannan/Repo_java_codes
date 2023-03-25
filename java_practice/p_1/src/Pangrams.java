import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*A pangram is a string that contains every letter of the alphabet. 
Given a sentence determine whether it is a pangram in the English alphabet. 
Ignore case. Return either pangram or not pangram as appropriate.*/

/* Different Test cases
"The quick brown fox jumps over the lazy dog" - Pangram
"The quick brown fox jumps over THE LAZY DOG" - Pangram
"The quick brown fox jumps over the lazy dog." - Not a pangram
"Hello, world!" - Not a pangram
"A quick brown fox jumps over the lazy dog. Pack my box with five dozen liquor jugs." - Pangram
"The 1 quick brown fox jumps over the lazy dog!" - Pangram
"El veloz murciélago hindú comía feliz cardillo y kiwi." - Not a pangram (in English)
 * 
 */

public class Pangrams {
	public static void main(String[] args) {
		List<String> inputs=new ArrayList<String>();
		inputs.add("The quick brown fox jumps over the lazy dog");
		inputs.add("The quick brown fox jumps over THE LAZY DOG");
		inputs.add("The quick brown fox jumps over the lazy dog.");
		inputs.add("Hello, world!");
		inputs.add("A quick brown fox jumps over the lazy dog. Pack my box with five dozen liquor jugs.");
		inputs.add("The 1 quick brown fox jumps over the lazy dog!");
		inputs.add("El veloz murciélago hindú comía feliz cardillo y kiwi.");
		inputs.add("We promptly judged antique ivory buckles for the next prize");
		inputs.forEach(i -> System.out.println(i+"="+isPangram(i)));
		
	}

	public static String isPangram(String s) {
		List<Character> alphabet=IntStream.rangeClosed('a', 'z')
				.mapToObj(c -> (char)c)
				.collect(Collectors.toList());
		return IntStream.range(0, alphabet.size())
				.allMatch(i -> 
					s.replaceAll("\\s","")
					.toLowerCase()
					.contains(String.valueOf(alphabet.get(i)))
					)?"pangram":"not pangram";
	}
}
