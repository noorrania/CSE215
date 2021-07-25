import java.util.Scanner;

public class Consecutive_order_of_3 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int count;
	int size=in.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=in.nextInt();
		
	}
	for(int i=2;i<size;i++)//if u dont set it right then it will occur runtime error
	{count=0;
		if(arr[i]==arr[i-1] && arr[i]==arr[i-2]) {
		count++;
	}
		if(count>=1) 
		{
			System.out.print(arr[i-3]+" ");
		}
		
	}
	
	in.close();

	}

}
