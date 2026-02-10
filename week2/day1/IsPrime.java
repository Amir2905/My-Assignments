package week2.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 71;
		boolean primeNumber = true;
		if (n<=1) // 0 and 1 are not a prime Number
		{
			primeNumber = false;
		}
		else 
		{
			for(int i=2; i<n; i++) //For loop to identify whether given number is prime
			{
				if (n%i==0)
				{
					primeNumber = false;
					break; //No need to check further
				}
			}
		}
				//print the given number is Prime or not
				if (primeNumber==true)
				{
					System.out.println(n + " is a Prime Number");
				}
				else
				{
					System.out.println(n + " is a not a Prime Number");
				}
			}
		}

	


