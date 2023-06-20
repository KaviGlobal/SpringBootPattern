package StreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleOddOrEven {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,20);
		List<Integer> evenNumbers=nums.stream().filter(n->n%2==0).toList();
		List<Integer> oddNumbers=nums.stream().filter(n->n%2!=0).toList();
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		
	}
}