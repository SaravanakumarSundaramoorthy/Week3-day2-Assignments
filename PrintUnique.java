package week3.day2.assignments;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s="Saravanakumar";
		
		char[] cnt = s.toCharArray();
		
		Set<Character> my = new LinkedHashSet<Character>();
		

for(int i=0;i<cnt.length;i++) {
	
	boolean add = my.add(cnt[i]);
	
	if(!add)
	{
		my.contains(cnt[i]);
		my.remove(cnt[i]);
	}
	else {
		my.add(cnt[i]);
	}
}
		
		System.out.println("Print the Unique Characters: "+ my);
	}

}
