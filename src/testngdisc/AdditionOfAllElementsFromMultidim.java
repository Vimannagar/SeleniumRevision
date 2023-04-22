package testngdisc;

public class AdditionOfAllElementsFromMultidim {
	
	
	
	public static void main(String[] args) {
		
		int b[][]= {{8, 9, 3}, {2, 1}, {1, 2}};
		int sum =0;
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
			sum = sum	+ b[i][j];
			}
		}
		
		System.out.println(sum);
		
	}

}
