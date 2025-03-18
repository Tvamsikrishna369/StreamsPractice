//5. WAP to group list of numbers by Prime number or not

package com.krishna.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrimeNotPrime {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(2, 5, 50, 49, 24, 25, 63, 634, 1 , 34);
		
		Map<String, List<Integer>> prime = num.stream()
		.sorted()
		.collect(Collectors.groupingBy(no -> (no == 1) ? "Not a Prime/Composite" : isprime(no) ? "Prime" : "Composite"));
		
		System.out.println(prime);
		
	}

	@SuppressWarnings("unused")
	private static boolean isprime(Integer no) {
		// TODO Auto-generated method stub
		if(no<=1) {			
			return false;
		}
		
		for(int i = 2; i<no; i++) {
			if(no%i == 0) {
				return false;
			}
			return true;
		}
		return false;
	}

}
