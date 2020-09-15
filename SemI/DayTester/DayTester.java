import java.until.Scanner;

public class DayTest {
  public static void main(String [] arg) {

    Scanner input = new Scanner(System.in);

    Day myBirthday = new Day(year, month, day); //(year, month, day)
    System.out.println(myBirthday.toString());
    int daysAlive = today.daysFrom(myBirthday);

    System.out.println("Year of birth:");
    year = input.nextInt();

    System.out.println("Month of birth:");
    month = input.nextInt();

    System.out.println("Day of birth:");
    day = input.nextInt();

    System.out.println("Days alive: " + daysAlive);
  }
}
