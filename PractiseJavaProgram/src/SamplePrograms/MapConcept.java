package SamplePrograms;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapConcept {
	
	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("a", 100);
		hm.put("c", 100);
		hm.put("c", 500);
		hm.put("e", 400);
		hm.put("d", 200);
		Set<Map.Entry<String, Integer>> st = hm.entrySet();
		System.out.println(st);
		for(Map.Entry<String, Integer> loop:st) {
		System.out.println(loop.getKey()+":"+loop.getValue());
		}
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		Arratsort(map);
		
		Map<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(101,"ajay"); 
        ht.put(101,"vijay"); 
        ht.put(102,"Ravi"); 
        ht.put(103,"Rahul"); 
        System.out.println("-------------Hash table--------------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 

	}
		
	
	public static void Arratsort(AbstractMap<Integer, String> map) {
		int[] s1 = {1,2,7,4,3,8};
		for(int s2:s1) {
			map.put(s2, Integer.toString(s2));
			
		}
		System.out.println(map);
		
		for(int k:map.keySet()) {
		System.out.print(k+",");
		}
		
		}
		

		}


