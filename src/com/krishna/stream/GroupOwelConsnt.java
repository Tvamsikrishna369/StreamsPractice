package com.krishna.stream;

import java.util.Arrays;

import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Stream;

public class GroupOwelConsnt {
 

	public static void main(String[] args) {
		
		
		
		List<String> string = Arrays.asList("vamsi", "krishna", "kumar", "hari");
		
		Stream<String> sorted = string.stream()
		.sorted();
//		.collect(Collector.groupingBy(s -> s.charAt(0)));
		
		System.out.println(sorted);
		
	}

}
