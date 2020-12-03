/**
   This class tests the CashRegister class.
*/

import java.util.Scanner;

public class CashRegisterTester {
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      Scanner input = new Scanner(System.in);

      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      register.receivePayment(2, 0, 5, 0, 0);
      //System.out.print("Change: ");
      //System.out.println(register.giveChange());
      //System.out.println("Expected: 0.25");

      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
      register.receivePayment(23, 2, 0, 0, 0);
      //System.out.print("Change: ");
      //System.out.println(register.giveChange());
      //System.out.println("Expected: 2.0");

      //   ---

      System.out.println("How much is your Purchase?") ;
      t1 = input.nextDouble();
      register.r 
      System.out.println("How much is your Payment?") ;
      System.out.println("Insert insert dollars played: quaters payed, dimes payed, nickles payed, pennies payed.") ;
      t2 = (register.receivePayment(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));
      System.out.println(t2);

      //t1 % t2;
      //System.out.println("Your change is " + change);

   }
}
