import java.util.Arrays;import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Boats2SavePeople {
	public static void main(String[] args) {
		//int[] p= {3,5,3,4};
		int[] p= {3,2,2,1};
		int l=3;
		List<Integer> ls = Arrays.stream(p)
                .boxed().sorted()
                .collect(Collectors.toList());
	}
	public static int solution(List<Integer> ls,int l) {
			int c=0,left=0,right=ls.size()-1;
			
	        while(left <= right){
	            if(ls.get(left) + ls.get(right) <= l){
	                left++;
	                right--;
	            }
	            else{
	                right--;
	            }
	            c++;
	        }
	return	c;
	}
}
