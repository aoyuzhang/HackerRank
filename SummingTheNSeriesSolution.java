//https://www.hackerrank.com/challenges/summing-the-n-series



import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class SummingTheNSeriesSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        for (int i=0;i<t;i++)
        {
            String input= scanner.next();
            BigInteger number= new BigInteger(input);
            BigInteger result= number.multiply(number).mod(new BigInteger("1000000007"));
            System.out.println(result);
            
        }
    }
}
