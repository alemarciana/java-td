package bank;
public class BankAccountTest {
	public static void main(String[] args){
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		// Depositar 69 usd a la cta corriente en account1
		account1.depositCurrentAcct(69);
		// Depositar 1000 usd a la cta de ahorros en account1
		account1.depositSavingsAcct(1000);
		// Depositar 20 usd a la cta de ahorros en account2
		account2.depositSavingsAcct(20);
		// Obtener saldo de la cta corriente en account1
		System.out.println("El saldo de la cta. corriente, en la cuenta bancaria n° " + account1.getAcctNumber() + " es: " + account1.getCurrentAcctBalance() + " USD");
		// Obtener saldo de la cuenta de ahorros en account2
		System.out.println("El saldo de la cta. de ahorros, en la cuenta bancaria n° " + account2.getAcctNumber() + " es: " + account2.getSavingsAcctBalance() + " USD");
		// Obtener el saldo total de la cuenta bancaria account1
		System.out.println("El saldo total de la cuenta bancaria n° " + account1.getAcctNumber() + " es: " + account1.getTotalAcctBalance());
		// Intentar retirar 25 USD de la cuenta de ahorros en account2
		account2.withdrawSavingsAcct(25);
		System.out.println("El numero actual de cuentas registradas es: " + BankAccount.getNOfAccounts());
		// Intentar retirar 50 USD de la cuenta corriente en account1
		// y luego obtener saldo nuevamente
		account1.withdrawCurrentAcct(50);
		System.out.println("El saldo de la cta. corriente, en la cuenta bancaria n° " + account1.getAcctNumber() + " es: " + account1.getCurrentAcctBalance() + " USD");
		// Obtener monto total de todas las cuentas
		System.out.println("El saldo total de todas las cuentas es: " + BankAccount.getTotalBalance());
	}
}
