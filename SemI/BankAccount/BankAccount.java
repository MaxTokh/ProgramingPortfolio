/**
* @author  Max Tokhtuev
* @version 1.0
* @since   2020-09-30
*/

import java.util.Scanner;

public class BankAccount {
  private double balance;
  private Scanner input;
  private int numerTimesTrans;

  public double monthlyCharge;

//Constructors
  public BankAccount(){
    this.balance = 0;
    this.numerTimesTrans = 0;
    //this.fees = #;
    //this.transactions = #;
  }

  //Member methods
    public double getBalance() {
      return balance;
    }
    /*
    * @param Is used to see how much money one possesses.
    */

    public void deposit(double amount) {
      balance = balance + amount;
      numerTimesTrans += 1;
    }
    /*
    * @param Is used to deposit mulla into an account.
    */

    public void withdrawl(double amount) {
      balance = balance - amount;
      numerTimesTrans += 1;

    }
    /*
    * @param Is used to withdrawl mulla from an account.
    */

    public void setTransactionFee(double fee) {
      balance = balance - .10;
      numerTimesTrans += 1;
    }
    /*
    * @param Is used to withdrawl a setTransactionFee.
    */

    public void deductMonthlyCharge(String yaya) {
      if(yaya == "yes"){
          balance = balance - .10;
    } else {
      balance = balance;
    }
    /*
    * @param Is used to withdrawl a fee at the start of every month.
    */
  }
}
