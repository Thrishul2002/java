package java8features;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* Author :Jeedipalli.Reddy
* Date   :9 Nov 2024
* Time   :12:31:05 pm
* Email  :Jeedipalli.Reddy@gmail.com
*/

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] marks= {45,88,99,45,75,23};
		
		Stream<Integer> strm=Stream.of(marks);
		
		strm.forEach(i->System.out.println(i));
		
		List<Integer> grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(6);
		grades.add(5);
		grades.add(7);
		grades.add(8);
		grades.add(9);
		
		Stream<Integer> strm1=grades.stream();
		
		System.out.println("******** ArrayList Contents ********");
		strm1.forEach(System.out::println);
		
		List<Integer> squares=grades.stream().map(m->m*m).collect(Collectors.toList());
		
		System.out.println("******** ArrayList Contents after squaring ********");
		squares.forEach(System.out::println);
	}

}
