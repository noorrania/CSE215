import java.util.Scanner;

public class Banking_four_display_with_infinite_loop {
	
static double balance=0.00;
public static void deposite(double amount)
{
balance=balance+amount;


}
public static void withdraw(double amount) 
{if(balance>amount)
balance=balance-amount;


	
}
	public static void main(String[]args)
	{		Scanner input = new Scanner(System.in);
	int choice;
	
		double amount;
		for(;;)
	//input choice
		{
		choice=input.nextInt();
			switch(choice) {
			case 1:
	amount=input.nextDouble();
	deposite(amount);
	break;
			case 2:
	//2-withdraw
	double withdrawal=input.nextDouble();
		withdraw(withdrawal);
		break;
			case 3:
	//3-balance
	System.out.println(String.format("%.2f",balance));
	break;
			case 4:
	//4-exit
	System.exit(0);	
	}
	
	}
}

}

