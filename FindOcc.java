package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;

public class FindOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,8,1,2};
		Map<Integer,Integer> occ=new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<a.length;i++) {
	    	if(occ.containsKey(a[i])) {
	    		Integer integer = occ.get(a[i]);
	    		occ.put(a[i], integer+1);
	    	}
	    	else {
	    		occ.put(a[i], 1);
	    	}
	    }
	    System.out.println(occ);
	}

}
