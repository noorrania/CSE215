import java.util.Scanner;

public class Vowel {
	public static void  countVowels(String arg) {
		Scanner in=new Scanner(System.in);
		int count=0;
		String str="";
		str=arg.replaceAll("[^AaEeiIoOUu]","");
			
			
		System.out.println(str.length());
		in.close();
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String arg=in.nextLine();
		countVowels(arg);
		in.close();
	}
}
