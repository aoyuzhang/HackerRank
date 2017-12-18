/*
 * Write a method to replace all spaces in a string with '%20%. 
 * You may assume that the string has sufficient space at the end of the String
 *  to hold the additional characters.
 */
import java.util.Scanner;
public class ReplaceCharacters {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String input=scanner.nextLine();
		System.out.println(replaceSpace(input));
		
		// TODO Auto-generated method stub

	}
	public static String replaceSpace(String input)
	{
		// count the number of space
		int nOfSpaces=0;
		for(int i=0;i<input.length();i++)
			if(input.charAt(i)==' ')
				nOfSpaces++;
		char[] charArray= new char[200];
		int m=input.length()+2*nOfSpaces;
		charArray[m]='\0'; 
		
		for(int i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)==' ')
			{
				charArray[m-1]='0';
				charArray[m-2]='2';
				charArray[m-3]='%';
				m=m-3;
			}
			else
			{
				charArray[m-1]=input.charAt(i);
				m=m-1;
			}	
		}
		return new String(charArray);
	}

}
