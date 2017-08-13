//https://www.hackerrank.com/challenges/sherlock-and-permutations

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class SherlockAndPermutationSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        int t= scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            int n= scanner.nextInt();
            int m= scanner.nextInt();
            BigInteger result= binomial(n+m-1,n).mod(new BigInteger("1000000007"));
            System.out.println(result);
            
        }
        
    }
    public static BigInteger binomial(final int N, final int K) {
    BigInteger ret = BigInteger.ONE;
    for (int k = 0; k < K; k++) {
        ret = ret.multiply(BigInteger.valueOf(N-k))
                 .divide(BigInteger.valueOf(k+1));
    }
    return ret;
}
}
