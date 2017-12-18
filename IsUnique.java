/*
 * Implement an algorithm to determine if a string has all
 * unique characters. What if you cannot use additional data structure?
 */
import java.util.Scanner;
public class IsUnique {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String string= scanner.next();
		if(isUnique1(string))
			System.out.println("True");
		else
			System.out.println("False");
		
		// TODO Auto-generated method stub

	}
	
	public static boolean isUnique1(String s)
	{
		int[] check= new int[500];// used to see if a character has already appeared.
		for(int i=0;i<s.length();i++)
		{
			if(check[s.charAt(i)]>=1)
				return false;
			check[s.charAt(i)]++;
		}
		return true;
	}
	
	

}
