import java.util.Scanner;

public class Pallindrome_task2 {
	public static void  isPalidrome(String arg)
	{
		
		String temp="";

	for(int i=arg.length()-1;i>=0;i--)
	{	
		temp+=arg.charAt(i);
		}

		if(arg.equalsIgnoreCase(temp))
	{
	System.out.println(arg+" is a Palindrome.");	
	}
	else
	{
	System.out.println(arg+" is not a Palindrome.");	
	}
		}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	   String arg=in.next();
	   isPalidrome(arg);

in.close();
	}


}