package SamplePrograms;

public class PrimeNumber {
	
	
	public static boolean IsPrime(int num)
	{
		if(num<2) {
		return true;
		}
		 for(int i=2;i<num;i++) {
			if(num % i==0) {
				return false;
			}
		 }
		 return true;
	}
	public static void main(String[] args) {
		System.out.println("10 is a primenumber: " +IsPrime(10));
	}
	
	
	
}
