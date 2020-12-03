import java.util.Scanner;

public class CashRegister {
  private double balance;
  private double item;

  //Constructors
  public CashRegister(){
    this.balance = 0;
    this.item = 0;
  }

    //Member methods
    public double getItemCount() {
      return balance;
    }

    public double reset() {
      balance = 0;
      return balance;
    }

    public double addItem(double amount) {
      balance = balance + amount;
      item = item + 1;
      return balance;
    }

    public double checkNumbOfItems() {
      return item;
    }

      //System.out.println("Enter the price of your first item: ");
      //this.balance = input.nextDouble());

}


//Ask to

//Enhance the CashRegister class so that it counts the purchased items.
//Provide a getItemCount method that returns the count.
