import java.util.Scanner;

public class Greater_array_percentage {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int sum;
		double avr,percentage,count=0;
                int[] arr=new int[6];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();

		}
		sum=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5];
		avr=(double)sum/6;

		for(int data:arr) {
			if(avr<data)
			{count++;

			}}
		percentage=(count*100)/6;

		System.out.printf("%.2f",percentage);
		System.out.print("%");

		in.close();
	}

}
