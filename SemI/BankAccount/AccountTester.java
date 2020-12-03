import java.util.Scanner;

public class AccountTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BankAccount account = new BankAccount();

    System.out.println("Is it a new month? Answer yes or no.") ;
    account.deductMonthlyCharge(input.next());

    System.out.println("How much would you like to deposit?") ;
    System.out.println("Fee of ten cents.") ;
    account.deposit(input.nextDouble());
    //account.setTransactionFee(double);
    account.withdrawl(.10);

    System.out.println("How much would you like to withdrawl?");
    System.out.println("Fee of ten cents.");
    account.withdrawl(input.nextDouble());
    account.withdrawl(.10);

    System.out.println("Account Balance: " + account.getBalance());
    System.out.println("Thank you!");
  }
}


/*
while(filler = false) {
  System.out.println("How much would you like to withdrawl?");
  fillerTwo = input.nextDouble();
  account.withdrawl(fillerTwo);
  if (fillerTwo = 0) {
    filler = true;
    account.withdrawl(.10);
  }

---

  public void deductMonthlyCharge() {
    if(newMonth = true){
        balance = balance - .10;
  }

*/
