import java.awt.Rectangle;

public class CopyDemo {
  public static void main(String[] args){
    Rectangle box = new Rectangle(5,10,20,30);
    Rectangle box2 = box;

    System.out.println("box: " + box);
    System.out.println("box: " + box2);

    box2.translate(15,25);

    System.out.println("box: " + box);
    System.out.println("box: " + box2);

    int luckyNumber = 7;
    int luckyNumber2 = luckyNumber;

    System.out.println("luckyNumber: " + luckyNumber);
    System.out.println("luckyNumber2: " + luckyNumber2);

    luckyNumber2 = 12;

  }
}
