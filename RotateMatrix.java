import java.util.Scanner;
import java.util.Random;
public class RotateMatrix {

	public static void main(String[] args) 
	{
		Random rand= new Random();
		final int dimention=5;
		int[][] matrix= new int[dimention][dimention];
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
				matrix[i][j]= rand.nextInt(50)+1;
		printMatrix(matrix);
		System.out.println();
		rotate(matrix, dimention);
		printMatrix(matrix);
		
		
		
		// TODO Auto-generated method stub

	}
	public static void printMatrix(int[][] m){
	    try{
	        int rows = m.length;
	        int columns = m[0].length;
	        String str = "|\t";

	        for(int i=0;i<rows;i++){
	            for(int j=0;j<columns;j++){
	                str += m[i][j] + "\t";
	            }

	            System.out.println(str + "|");
	            str = "|\t";
	        }

	    }catch(Exception e){System.out.println("Matrix is empty!!");}
	}
	public static void rotate(int[][] m, int n)
	{
		for(int layer=0;layer<n/2;layer++)
		{
			int first=layer;
			int last= n-1-first;
			for(int i=first;i<last;++i)
			{
				int offset=i-first;
				int temp=m[first][i]; // save the top 
				m[first][i]=m[last-offset][first]; // put left to top
				m[last-offset][first]=m[last][last-offset]; // put bottom to left
				m[last][last-offset]=m[i][last]; // put right to bottom
				m[i][last]=temp;		
			}
		}
		
	}

}
