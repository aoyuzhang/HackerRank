import java.util.Scanner;
import java.util.Random;
public class SetZero 
{

	public static void main(String[] args) 
	{
		int dimention =5;
		Random rand= new Random();
		int[][] matrix= new int[dimention][dimention];
		for(int i=0;i<dimention;i++)
		{
			for(int j=0;j<dimention;j++)
			{
				matrix[i][j]= rand.nextInt(10);
			}
			
		}
		printMatrix(matrix);
		boolean[] rows= new boolean[dimention];
		boolean[] column= new boolean[dimention];
		for(int i=0;i<dimention;i++)
			for(int j=0;j<dimention;j++)
				if(matrix[i][j]==0)
				{
					rows[i]=true;
					column[j]=true;
				}
		for(int i=0;i<dimention;i++)
		{
			for(int j=0;j<dimention;j++)
			{
				if(rows[i]||column[j])
					matrix[i][j]=0;
			}
		}
		System.out.println();
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

}
