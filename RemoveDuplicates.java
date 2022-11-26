package week3.day2.assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		

		String[] split = text.split(" ");
		
		Set<String> my = new LinkedHashSet<String>();
		for (int i =0;i<split.length;i++) {
			System.out.println(split[i]);
		

		

		for(int j=0;j<split.length;j++) {
			my.add(split[j]);
		}
		
		}
		System.out.println(my);
		System.out.println(String.join(" ", my));
		

	}

}
