package SamplePrograms;

public class PalindromProgram {

	public static void main(String[] args) {
		int num =454, sum=0,original,r;
		original=num;
		
		while(num>0) {
			r=num%10;
			sum =(sum*10)+r;
			num=num/10;			
		}
		if(sum==original) {
			System.out.println("Palindrom");
				}
		else {
			System.out.println("not a palindrom");
		}
		}

}
