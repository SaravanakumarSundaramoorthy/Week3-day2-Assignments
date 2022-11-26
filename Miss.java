package week3.day2.assignments;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Miss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int s[]= {1,2,4,5,6,5,7};

		int input=1;
		Set<Integer> my=new LinkedHashSet<Integer>();


		for(int i=0;i<s.length;i++) {
			my.add(s[i]);
			
		}
				System.out.println(my);
				
	for (Integer Missnum : my) {
		if(Missnum!=input++) {
			System.out.println(input-1);
			break;
	}
			
				
			
		}
	}

}

