package StreamsExample;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReverseString {

	public static void main(String[] args) {
		String s="madam madam";
		String reverseString=Stream.of(s).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		System.out.println("ReverseString"+reverseString);

	}
}