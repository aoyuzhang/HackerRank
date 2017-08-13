//https://www.hackerrank.com/challenges/diwali-lights

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class DiwaliLightsSolution {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++)
        {
            int input= scanner.nextInt();
            int result=1;
            for(int j=0;j<input;j++)
                result=result*2%100000;   
            

            result--;
            System.out.println(result+" ");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
