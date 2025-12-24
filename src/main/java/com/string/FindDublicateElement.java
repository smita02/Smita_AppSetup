package com.string;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FindDublicateElement {
	public static void logic1() {
		int arr[] = {34,89, 99,39, 99, 39,99,99,99,99};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				continue;
				
			}
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
					count++;
				}
				
				
			}
			if(count>1) {
//				System.out.println(arr[i]);
			}
		}
		

	}
	public static void logic2() {
		int arr[] = {34,89, 99,39, 99, 39,99,99,99,99};
		Set s = new HashSet();
		Set f = new HashSet();
		for(int a : arr) {
			if(!s.add(a)) {
//				System.out.println(a);
			  f.add(a);
			}
		}
		System.out.println(f);

	}
	public static void logic3() {
		int arr[] = {34,89, 99,39, 99, 39,99,99,99,99};
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap();
       for(int a : arr) {
    	   
    	  if(map.containsKey(a)) {
    		  map.put(a, map.get(a)+1);
    	  }else {
    		  map.put(a, 1);
    	  }
    	  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    		  if(entry.getValue()>1) {
    			  System.out.println(entry.getKey()+" - "+entry.getValue());
    		  }

    	  } 
    	  
}

		
	}
	public static void main(String[] args) {
//		logic2();
//		logic3();
		
		int arr[] = {34, 89, 99, 39, 99, 39, 99, 99, 99, 99};

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		// Step 1: Count frequency
		for (int a : arr) {
		    if (map.containsKey(a)) {
		        map.put(a, map.get(a) + 1);
		    } else {
		        map.put(a, 1);
		    }
		}

		// Step 2: Print duplicates
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    if (entry.getValue() > 1) {
		        System.out.println(entry.getKey() + " - " + entry.getValue());
		    }
		}
	}

}
