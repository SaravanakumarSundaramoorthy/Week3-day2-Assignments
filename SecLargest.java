package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[]= { 10 ,50,80,90,150,1,8,21};
		Set<Integer> my = new LinkedHashSet<Integer>();
		
		
		for(int i=0;i<arr.length;i++) {
			my.add(arr[i]);
		}
		List<Integer> seclarge=new ArrayList<Integer>(my);
		Collections.sort(seclarge);
		System.out.println("Second Largest number is " + seclarge.get(seclarge.size()-2));
	}

}
