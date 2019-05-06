package SamplePrograms;

public class FindDuplicate {

public static void main(String[] args) {
	
	String d1= "H e m a l a t h a";
	String[] d2 = d1.split(" ");
	System.out.println(d2.length);
	
	for(int i=0;i<d2.length;i++) {
		if(d2[i].equalsIgnoreCase("a")) {
			System.out.println(d2[i]);
		}
	
	}
	
}
	
}
