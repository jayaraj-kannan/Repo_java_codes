import java.util.Arrays;
//To reformat the string 1+3+2 as 1+2+3
public class SortStringWithInt {
	public static void main(String[] args) {
		String s="1+3+2";
		String output=Arrays.stream(s.split("\\+"))
				.sorted()
				.reduce((s1,s2)->s1+ "+"+s2)
				.orElse("");
		System.out.println(output);

	}
}