package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare variables
		int maxRange = 8;
		int a = 0, b = 1;
		
		//For loop will run till it reaches the range
		for(int i=1;i<maxRange;i++)
		{
			System.out.println(a + " ");
			int next = a+b; // calculate the next fibonacci number
			a = b; // move b value in to a
			b = next; // move next value in to b
		}
		
		
		

	}

}
