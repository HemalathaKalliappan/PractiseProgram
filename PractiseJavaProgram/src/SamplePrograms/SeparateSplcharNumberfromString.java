package SamplePrograms;

public class SeparateSplcharNumberfromString { 

	public static void main(String[] args) {
		String s1="#st@3rv52foZ@986&y";
		StringBuffer number = new StringBuffer();
		StringBuffer char1 = new StringBuffer();
		StringBuffer special = new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			if(Character.isDigit(s1.charAt(i))) 
				char1.append(s1.charAt(i));
		
		else if(Character.isAlphabetic(s1.charAt(i)))
		number.append(s1.charAt(i));
		else {
			special.append(s1.charAt(i));
		}
		}
		System.out.println(number);
		System.out.println(char1);
		System.out.println(special);
	}
	

}
