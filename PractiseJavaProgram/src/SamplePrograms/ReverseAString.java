package SamplePrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String d1 = "*****";
		byte[] d2 = d1.getBytes();
		byte[] result = new byte[d2.length];
		for(int i=0;i<d2.length;i++) {
			result[i] = d2[d2.length-i-1];
			//System.out.println(new String(result));
		}
		System.out.println(new String(result));
	}
	
	
}
