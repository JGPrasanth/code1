import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] balances = new double[10];
		int choice;
		for(int i=0;i<10;i++)
		{
			balances[i] = 0.0;
		}
		do {
			int accno;
			double amount;
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Enquire balance");
			System.out.println("9.Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Please enter your Account number: ");
				accno = sc.nextInt();
				if(0<=accno && accno<=9) {
					System.out.println("Enter the amount to be deposited: ");
					amount = sc.nextDouble();
					balances[accno]+=amount;
					System.out.println("Your account is deposited with "+amount);
					System.out.println();
					break;
				
				}
				else {
					System.out.println("Invalid Account number");
					System.out.println();
					break;
				}
			
			case 2:
				System.out.println("Please enter your Account number: ");
				accno = sc.nextInt();
				if(0<=accno && accno<=9) {
					System.out.println("Enter the amount to be withdrawn: ");
					amount = sc.nextDouble();
					if(amount>balances[accno])
					{
						System.out.println("Insufficient balance");
						System.out.println();
						break;
					}
					balances[accno]-=amount;
					System.out.println(amount+" is withdrawn from your account");
					System.out.println();
					break;
				
				}
				else {
					System.out.println("Invalid Account number");
					System.out.println();
					break;
				}
			
			case 3:
				System.out.println("Please enter your Account number: ");
				accno = sc.nextInt();
				if(0<=accno && accno<=9) {
					System.out.println("Your total balance is: "+balances[accno]);
					System.out.println();
					break;
				
				}
				else {
					System.out.println("Invalid Account number");
					System.out.println();
					break;
				}
				
			case 9: System.out.println("Thank you for visiting our bank");
				break;
				
				
			}
		} while(choice!=9);

	}

}
