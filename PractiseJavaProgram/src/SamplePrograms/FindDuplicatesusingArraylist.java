package SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesusingArraylist {
	
	public static void main(String[] args) {
		 String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java","JavaScript" }; 
		ArrayList<String> b = new ArrayList<String>(Arrays.asList(names));
		ArrayList<String> newlist = removeduplicate(names);
		System.out.println(newlist);
		
	}
	
	public static <T> ArrayList<T> removeduplicate(String[] names1){
		ArrayList<T> newlist = new ArrayList<T>();
		for(String elem:names1)
		{
			if(!newlist.contains(elem)) {
				newlist.add((T) elem);
			}
		}
		return newlist;
	}
	
	
	/*public static <T> ArrayList<T> removeDuplicate(ArrayList<T> list) {
		ArrayList<T> newlist = new ArrayList<T>();
		for(T element:list) {
			if(!newlist.contains(element)) {
				newlist.add(element);
			}
		}
		return newlist;
	}
	
    public static void main(String args[]) 
    { 
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        System.out.println("ArrayList with duplicates: "+ list); 
        ArrayList<Integer> newlist = removeDuplicate(list);
        System.out.println(newlist);
      
        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java","JavaScript" }; 
       
        for(int i=0;i<names.length;i++) {
        	for(int j=i+1;j<names.length;j++) {
        		if(names[i].equals(names[j]))
        		{
        		System.out.println(names[i]);
        		}
        	}
        }
    } */
}
