/*
 * Given two strings, write a method to decide if one is a permutation of the other
 */
import java.util.Scanner;
public class PermutedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String in= scanner.next();
		String comp=scanner.next();
		if(isPermuted2(in,comp))
			System.out.println("true");
		else
			System.out.println("false");
	}
	// First solution sort two string and then compare them
	public static boolean isPermuted1(String in, String out)
	{
		if(in.length()!=out.length())
			return false;
		String temp1=sort(in);
		String temp2=sort(out);
		return temp1.equals(temp2);
		
	}
	public static String sort(String s)
	{
		char[] temp= s.toCharArray();
		java.util.Arrays.sort(temp);
		return new String(temp);
	}
	// Second solution count the number of times that each characters appear.
	public static boolean isPermuted2(String in, String out)
	{
		if(in.length()!=out.length())
			return false;
		
		int[] counts= new int[256];
		char[] charArray= in.toCharArray();
		for(char c: charArray)
		{
			counts[c]++;
		}
		
		for(int i=0;i<out.length();i++)
		{
			if(--counts[out.charAt(i)]<0)
				return false;
		}
		return true;
		
	}
	

}
