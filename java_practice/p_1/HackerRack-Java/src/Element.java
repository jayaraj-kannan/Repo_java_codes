import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Element
{
	public static int  noOfElement(int[] element, int num)
	{
		int[] arr = {1, 2, 3, 4, 5};
		List<Integer> i=Arrays.stream(arr).boxed().collect(Collectors.toList());
		int  answer = 0;
		// Write your code here
		for(int i=0;i<element.length;i++) {
			if(element[i]<num ) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//input for element
		int element_size = in.nextInt();
		int element[] = new int[element_size];
		for(int idx = 0; idx < element_size; idx++)
		{
			element[idx] = in.nextInt();
		}
		// input for num
		int num = in.nextInt();
		
		
		int result = noOfElement(element, num);
		System.out.print(result);
		
	}
}
