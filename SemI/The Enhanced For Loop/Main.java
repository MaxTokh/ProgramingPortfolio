import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

      Random rand = new Random();
      int[] values = new int[100];

      for (int i = 0; i < values.length; i++) {
        int gen = rand.nextInt(199) - 99;
        values[i] = gen;
      }

      //Finds Sum
      double total = 0;
      for (double element : values) {
         System.out.println(element + " ");
         total = total + element;
      }
      System.out.println("Sum: " + total);

      //Finds Average
      double avg = 0;
      avg = total / 100;
      System.out.println("Avrage: " + avg);


      //Finds Max
      double max = 0;
      for(int i=0; i<values.length; i++ ) {
         if(values[i]>max) {
            max = values[i];
         }
      }
      System.out.println("Maximum: " + max);

      //Finds Min
      double min = 0;
      for(int i=0; i<values.length; i++ ) {
         if(values[i]<min) {
            min = values[i];
         }
      }
      System.out.println("Minimum: " + min);

      //Element Separator
      for (int i = 0; i < values.length; i++) {
        if (i > 0) {
          System.out.print(" | ");
        }
          System.out.print(values[i]);
      }

   }
}
