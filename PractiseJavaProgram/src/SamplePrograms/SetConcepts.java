package SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class SetConcepts {

	 public static void main(String args[]) 
	    { 
		  Random rand = new Random();
		 Set<Integer> generated = new LinkedHashSet<Integer>();
		int numtogen = 99;
		// Prevent repeat
		while (generated.size() < numtogen) {
		    generated.add(rand.nextInt(100));
		}
		List<Integer> list = new ArrayList<Integer>(generated);
		System.out.println(list);
		 
		/*Random rand = new Random();
		 IntStream ints = rand.ints(200, 1, 100);
		// System.out.println(ints);
		Int[] a =ints.forEach(System.out::println);
		ArrayList<Integer> a = new ArrayList<Integer>(); 
        a.addAll(ints);
		
		 */
	        /*Set<Integer> a = new HashSet<Integer>(); 
	        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
	        Set<Integer> b = new HashSet<Integer>(); 
	        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
	  
	        // To find union 
	        Set<Integer> union = new HashSet<Integer>(a); 
	        union.addAll(b); 
	        System.out.print("Union of the two Set"); 
	        System.out.println(union);
	  
	        // To find intersection 
	        Set<Integer> intersection = new HashSet<Integer>(a); 
	        intersection.retainAll(b); 
	        System.out.print("Intersection of the two Set"); 
	        System.out.println(intersection); 
	  
	        // To find the symmetric difference 
	        Set<Integer> difference = new HashSet<Integer>(a); 
	        difference.removeAll(b); 
	        System.out.print("Difference of the two Set"); 
	        System.out.println(difference);*/ 
	    } 
	
	
	



}
