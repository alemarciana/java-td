package bank;
import java.util.ArrayList;
import java.util.Random;
public class BankAccount {
	private String accountNumber;
	private double currentAcctBalance, savingsAcctBalance;
	private static ArrayList<String> accounts= new ArrayList<String>();
	private static int nOfAccounts = 0;
	private static double totalBalance;
	private static String createAccountNumber(){
		Random ran = new Random();
		String[] digits = new String[10];
		digits[0]="0";digits[1]="1";digits[2]="2";digits[3]="3";digits[4]="4";digits[5]="5";digits[6]="6";digits[7]="7";digits[8]="8";digits[9]="9";
		String accn = "";
		while ( accn.length() < 10 ){
			accn += digits[ran.nextInt(9)];
		}
		return accn;
	}
	public static int getNOfAccounts(){
		return nOfAccounts;
	}
	public static double getTotalBalance(){
		return totalBalance;
	}
	public BankAccount(){
		this.accountNumber = createAccountNumber();
		nOfAccounts++;
	}
	public String getAcctNumber(){
		return accountNumber;
	}
	public double getCurrentAcctBalance(){
		return this.currentAcctBalance;
	}
	public double getSavingsAcctBalance(){
		return this.savingsAcctBalance;
	}
	public double getTotalAcctBalance(){
		return this.savingsAcctBalance + this.currentAcctBalance;
	}
	public void depositSavingsAcct(double m){
		this.savingsAcctBalance += m;
		totalBalance += m;
	}
	public void depositCurrentAcct(double m){
		this.currentAcctBalance += m;
		totalBalance += m;
	}
	public void withdrawSavingsAcct(double m){
		if ( ( this.savingsAcctBalance - m ) < 0 ){
			System.out.println("No tiene fondos suficientes para retirar este monto");
		}
		else {
			System.out.println("Retiro exitoso!");
			this.savingsAcctBalance -= m;
			totalBalance -= m;
		}
	}
	public void withdrawCurrentAcct(double m){
		if ( ( this.currentAcctBalance - m ) < 0 ){
			System.out.println("No tiene fondos suficientes para retirar este monto");
		}
		else {
			System.out.println("Retiro exitoso!");
			this.currentAcctBalance -= m;
			totalBalance -= m;
		}
	}
}
