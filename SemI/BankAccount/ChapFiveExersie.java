import java.util.Scanner;

public class ChapFiveExersie {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("This program that reads in the height and width of a rectangle.");
    System.out.println("It will then prints out whether the rectangle is a square, or is in “portrait” or “landscape” orientation.");

    System.out.println("Chosse a Width:");
    Int width = myObj.nextLine();

    System.out.println("Chosse a Height:");
    Int height = myObj.nextLine();

    if (height == width){
      System.out.println("Is a square.");
    } else if (height > width){
      System.out.println("Is portrait.");
    } else if (height < width){
      System.out.println("Is landscape.");
    }

  }
}  


    // Write a program that reads in the x- and y-coordinates of two
    // corner points of a rectangle and then prints out whether the rectangle
    // is a square, or is in “portrait” or “landscape” orientation.
