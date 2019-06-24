package SamplePrograms;

public class RemoveSpecialCharacters {

	

	public static void main(String[] args) {
		String s1 = "hema123%$";
		String html = s1.replaceAll("[^a-zA-Z]", "");
		System.out.println(html);
		
		
		
		
		

	}

}
