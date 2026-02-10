package week2.day1;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 121;
		int output = 0;
		
		for (int i = input; i > 0; i = i / 10)// Looping through each digit by removing the last
		{
            int rem = i % 10; //Last digit of the number
            output = output * 10 + rem; // Reversed number
        }

        if (input == output) // check the value and print the result
        {
            System.out.println(input + " is a Palindrome");
        } 
        else 
        {
            System.out.println(input + " is NOT a Palindrome");
        }
    
				

	}

}
