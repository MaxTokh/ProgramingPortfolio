import java.util.Scanner;

public class TankerApp {
  //main method
  public static void main(String[] args) {
    System.out.println("Welcome to 'Tanker'");
    Scanner input = new Scanner(System.in);
    float avgDailyConsumption = 0;

    boolean validAvg = false;
    boolean validAge = false;
    int estLongevity = 0;

    while(!validAvg) {
      System.out.println("Ounces drank in a day:");
      avgDailyConsumption = input.nextFloat();
      if(avgDailyConsumption > 0){
        validAvg = true;
      }
    }

    while(!validAge) {
      System.out.println("Estimate life span:");
      estLongevity = input.nextInt();
      if(estLongevity > 0){
        validAge = true;
      }
    }

    input.close();

    float lifetimeFluid = avgDailyConsumption * estLongevity * 356;
    float totalTankers = lifetimeFluid / (128 * 11000);

    System.out.println("You will drink about " + totalTankers + " trucks");

  }
}
