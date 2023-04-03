import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class SumOfTraget {
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		
		System.out.println(twoSum(nums, target));
		System.out.println(twoSum1(nums, target));
	}

	private static int[] twoSum1(int[] nums, int target) {
		//using stream API
				List<Integer> c1= IntStream.range(0, nums.length)
			            .boxed()
			            .flatMap(i -> IntStream.range(i + 1, nums.length)
			                    .filter(j -> nums[i] + nums[j] == target)
			                    .mapToObj(j -> Arrays.asList(i, j)))
			            .findFirst()
			            .orElseThrow(() -> new IllegalArgumentException("No two sum solution"));
				return c1.stream().mapToInt(Integer::intValue).toArray();
	}

	public static int[] twoSum(int[] nums, int target) {
		List<Integer> c=new ArrayList<Integer>();
		int temp=0;
		//Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				temp=nums[i]+nums[j];
				if(temp==target) {
					c.add(i);
					c.add(j);
				}
			}
		}
		
		return c.stream().mapToInt(Integer::intValue).toArray();
	}
}
