package SamplePrograms;

public class fynodtriangle {

	public static void main(String[] args) {
		int row =1;
		for(int i=1; i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(row+" ");
				row++;
				
			}
			System.out.println();
		}

	}

}
