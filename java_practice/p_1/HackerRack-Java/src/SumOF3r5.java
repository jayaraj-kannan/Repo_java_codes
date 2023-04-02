import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOF3r5 {
	public static void main(String[] args) {
		int n=100;
		int res=0;
		for (int i = 0; i < n; i++) {
			if (i%3==0 || i%5==0)
				res+=i;
		}
		System.out.println(res);
		System.out.println(function(n));
	}
	public static  int function(int n) {
		return IntStream.range(0, n)
				.filter(i-> i % 3 == 0 || i%5 == 0)
				.sum();
	}
}
