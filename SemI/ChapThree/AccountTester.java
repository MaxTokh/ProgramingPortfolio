import java.util.Scanner;

public class accountTester {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    CashRegister amount = new CashRegister();

    System.out.println("How much does this item cost?") ;
    amount.addItem(input.nextDouble());

    System.out.println("How much does this item cost?") ;
    amount.addItem(input.nextDouble());


    System.out.println("How much does this item cost?") ;
    amount.addItem(input.nextDouble());


    System.out.println("How much does this item cost?") ;
    amount.addItem(input.nextDouble());

    System.out.println("How much does this item cost?") ;
    amount.addItem(input.nextDouble());

    System.out.print("You bought ") ;
    System.out.print(amount.checkNumbOfItems());
    System.out.println(" total items!") ;

    System.out.print("They totaled to $") ;
    System.out.print(amount.getItemCount());

  }
}
