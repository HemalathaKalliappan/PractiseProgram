package SamplePrograms;

public class FindDuplicate {

public static void main(String[] args) {
	
	String d1= "1 2 3 4 2 1";
	String[] d2 = d1.split(" ");
	System.out.println(d2.length);
	
	for(int i=0;i<d2.length;i++) {
		if(d2[i].equalsIgnoreCase("1")) {
			System.out.println(d2[i]);
		}
	
	}
	
}
	
}
