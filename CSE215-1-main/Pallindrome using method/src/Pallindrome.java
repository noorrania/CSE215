import java.util.Scanner;

public class Pallindrome {
	

public static void isPalidrome(String arg)
{
	

	String temp="";

for(int i=0;i<arg.length();i++)
{
	temp=arg.charAt(i)+temp;

}


if(arg.equals(temp))
	
{
	System.out.println(arg+" is a Palindrome.");	
}
else
{
System.out.println(arg+" is not a Palindrome.");	
}


}

public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
String arg=in.nextLine();
isPalidrome(arg);
in.close();
}
}
