import java.util.Scanner;

class BankAccount{
		private double balance;
		
		public BankAccount(double initialBalance) {
			balance = initialBalance;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void deopsite(double amount) {
			balance+=amount;
		}
		
		public boolean withdraw(double amount) {
			if(amount <=balance) {
				balance-=amount;
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	
	
class ATM{
	private BankAccount account;
	
	public ATM(BankAccount account) {
		this.account = account;
	}
	
	public void DisplayMenu() {
		System.out.println("welcome to ATM..!");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposite");
		System.out.println("3. Withdraw");
		System.out.println("4.Exit");
	}
	
	public void processTransaction() {
		Scanner sc = new Scanner(System.in);
		int choise;
		double amount;
		
		while(true) {
			DisplayMenu();
			System.out.println("Enter Choise : ");
			choise = sc.nextInt();
			
			switch(choise) {
			case 1 :
				System.out.println("Your Balance is Rs. "+account.getBalance());
				break;
			case 2:
				System.out.println("Enter Deposite amount : ");
				amount = sc.nextDouble();
				if(amount > 0) {
					account.deopsite(amount);
					System.out.println("Deposited Successfully...");
				}
				else {
					System.out.println("Invalid Deposite Amount..!");
				}
				break;
			case 3:
				System.out.println("Enter the withdrawl amount : Rs. ");
				amount = sc.nextDouble();
				if(amount > 0 && account.withdraw(amount)) {
					System.out.println("Amount Withdrawled Successfully..!");
				}
				else {
					System.out.println("Invalid withdrawl amount or insufficient balance.");
				}
				break;
			case 4:
				System.out.println("Thank You for using ATM. Good Bye!");
				return;
				default:
					System.out.println("Invalid Choise. Please try again");
			}
			
		}
	}
}
	
public class ATMtask{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount userAccount = new BankAccount(1000.0);
		ATM atm = new ATM(userAccount);
		atm.processTransaction();

	}
}
