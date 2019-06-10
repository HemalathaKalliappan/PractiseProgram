package SamplePrograms;

public class FindEvenAndOddNum {
public static void main(String[] args) {
	int[] nums = {1,2,3,4,5,6};
	
	for(int ie:nums) {
		if(ie%2==0) {
			System.out.println("Even number------>"+ie);
		}
		else {
			System.out.println("Odd number------>"+ie);
		}
	}
	
	
}
}
