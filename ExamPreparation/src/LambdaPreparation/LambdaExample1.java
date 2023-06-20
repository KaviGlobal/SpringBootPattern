package LambdaPreparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample1 {

	public static void main(String args[]) {

		List<Integer> lInt = new ArrayList<Integer>();
		lInt.add(1);
		lInt.add(2);
		lInt.add(3);
		lInt.add(4);
		lInt.add(5);
		lInt.forEach(n -> {
			System.out.println(n);
		});
		lInt.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
			if (n % 2 != 0)
				System.err.println(n);
		});
		
		lInt.forEach(n->{
		 if(n%3==0)System.out.println(n);
		 
		});
		List<Integer> square=lInt.stream().map(x->x*x).collect(Collectors.toList());
		List filter=square.stream().map(x->x%2==0).collect(Collectors.toList());
		List filter1=square.stream().filter(x->x%2==0).collect(Collectors.toList());
		
		List<Integer> sort=lInt.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sort);
		
		System.out.println("square..."+square);
		System.out.println("filter..."+filter);
		System.out.println("filter1..."+filter1);
		
	}
}
