import java.util.Scanner;

public class ChapFiveExersise {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("This program that reads in the height and width of a rectangle.");
    System.out.println("It will then prints out whether the rectangle is a square, or is in “portrait” or “landscape” orientation.");

    System.out.println("Chosse a Width:");
    String width = input.nextLine();

    System.out.println("Chosse a Height:");
    String height = input.nextLine();

    String str = width;
    String strr = height;

    int w = Integer.parseInt(str);
    int h = Integer.parseInt(strr);

    if (h == w){
      System.out.println("Is a square.");
    } else if (h > w){
      System.out.println("Is portrait.");
    } else if (h < w){
      System.out.println("Is landscape.");
    }

  }
}


    // Write a program that reads in the x- and y-coordinates of two
    // corner points of a rectangle and then prints out whether the rectangle
    // is a square, or is in “portrait” or “landscape” orientation.
