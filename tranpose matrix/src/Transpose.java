import java.util.Scanner;

public class Transpose {
	public static void printTrans(int[][] arr,int n) {
		Scanner in=new Scanner(System.in);
	    // Print elements
	    // at odd positions
	    for(int i=0;i < n;i++)
	    {for(int j=0;j<n;j++)
	    {
	         arr[i][j]=in.nextInt();
	
	
	    }
	    
	}
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<n;j++) {
	    System.out.print(arr[j][i]+" ");
	    	//System.out.println("");
	    	}
	    System.out.println();}in.close();
	}
	public static void main(String[] args)
	{Scanner in=new Scanner(System.in);
	  //  int[] arr = { 1, 2, 3, 4, 5 };
		int N=in.nextInt();
		int[][] arr=new int[N][N];
	    //int N = arr.length;
	     
	    printTrans(arr, N);
	    in.close();
	}
}
