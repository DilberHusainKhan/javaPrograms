import java.util.Scanner;

/*
 * Check length of a string is equal to the number appended at its last
 */

public class FindVaildString {
    static boolean isequal(String str)
	{
		int len = str.length();

		// Traverse string from end and find the number
		// stored at the end.
		// pow is used to store power of 10.
		
        int num = 0, pow = 1, i = len - 1;
		for (i = len - 1; i >= 0; i--)
		{
			if ('0' <= str.charAt(i) &&
				str.charAt(i) <= '9')
			{
				num = (str.charAt(i) - '0') * pow + num;
				pow = pow * 10;
				if(num>=len)
					return false;
			}
			else
				break;
		}
		// Check if number is equal to string
		// length except that number's digits
		return num == i + 1;
	}

	// Drivers code
	static public void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
        String str= sc.nextLine(); 
		if (isequal(str))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
