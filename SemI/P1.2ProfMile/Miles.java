import java.util.Scanner;

public class Miles {
  //main method
  public static void main(String[] args) {
    System.out.println("Let's determine how many miles you travel for work");
    System.out.println("& how many you travel for personal use.");
    Scanner input = new Scanner(System.in);
    int milesToWork = 0;
    int milesForFun = 0;

    boolean validWorkMiles = false;
    boolean validFunMiles = false;

    while(!validWorkMiles) {
      System.out.println("Number of Miles drove to work every day:");
      milesToWork = input.nextInt();
      if(milesToWork > 0){
        validWorkMiles = true;
      }
    }

    while(!validFunMiles) {
      System.out.println("Number of Miles drove for Fun every day:");
      milesForFun = input.nextInt();
      if(milesForFun > 0){
        validFunMiles = true;
      }
    }

    input.close();

    float totalWorkMiles = milesToWork * 2 * 5;
    float totalFunMiles = milesForFun * 5;

    System.out.println("You drive " + totalWorkMiles + " to work every week.");
    System.out.println("You drive " + totalFunMiles + " for fun every week!");

  }
}
