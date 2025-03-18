//2. WAP to group list of numbers by their Divisibility (2, 5, or neither)


package com.krishna.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByNum {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(2, 5, 50, 49, 24, 25, 63, 634, 34);
		
		Map<String, List<Integer>> output = num.stream()
		.collect(Collectors.groupingBy(no -> no%2 == 0 ? "DivideBy2" : no%5 == 0 ? "Divideby5" : "Neither" ));
		
		System.out.println(output);
		
	}

}
