import java.util.Arrays;

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