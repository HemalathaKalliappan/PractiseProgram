package SamplePrograms;

public class Pramidprogram {
	
	public static void main(String[] args) {
		
		int rownum =4;
		
		//forword pramid
		for(int i=1;i<=rownum;i++) 
		{
		for(int j=1;j<=i;j++) 
		{
		System.out.print(j);
		}
		System.out.println();
		}
		
		//Reversepramid
		for(int i=rownum;i>1;i--) 
		{
			for(int j=1;j<i;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
