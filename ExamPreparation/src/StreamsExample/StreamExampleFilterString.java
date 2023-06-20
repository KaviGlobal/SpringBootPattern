package StreamsExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExampleFilterString {

	public static void main(String[] args) {
		List<String> listString = Arrays.asList("sam", "Vasu", "VANI", "Vat", "Vamsi");
		
		listString.stream().sorted().forEach(System.out::println);
		
		Stream<String> wordStream = Stream.of("A","C","E","B","D");

		wordStream.sorted()									//ascending
				  .forEach(System.out::println);			
		
		wordStream.sorted( Comparator.reverseOrder() )		//descending
				  .forEach(System.out::println);
		
		/*listString.stream().map(String::toLowerCase).sorted().forEach(System.out::println);
		
		List<String> filterList = listString.stream().filter(a -> a.startsWith("V")).toList();
		System.out.println(filterList);

		filterList.stream().map(String::toLowerCase).sorted().forEach(System.out::println);
		
		List<Integer> number = Arrays.asList(2,3,4,5,6,8,10,12);
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		
		System.out.println("even..."+even);
		
		////sum of array values > 10
		number = Arrays.asList(2,3,4,5,6,8,11,12);
		System.out.println(number.stream().filter(i -> i>10).mapToInt(i->i).sum());
		//sum of array values
		System.out.println(number.stream().mapToInt(i->i).sum());*/
		
	}
}