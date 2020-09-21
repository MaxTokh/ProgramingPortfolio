import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.util.Scanner;
import java.awt.Font;

public class RectangleComponent extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

//Back Ground
      Rectangle bg = new Rectangle(00,00,600,250);
      g2.setColor(Color.LIGHT_GRAY);
      g2.fill(bg);
      g2.setColor(Color.BLACK);
      g2.draw(bg);

//get days until new year
      Scanner input = new Scanner(System.in);
      boolean yaya = false; //validWorkMiles
      int daysUntilNewYear = 0; //milesToWork
      while(!yaya) {
        System.out.println("How many days until New Years:");
        daysUntilNewYear = input.nextInt();
        if(daysUntilNewYear > 0){
          yaya = true;
        }
      }

//Max
    Rectangle box = new Rectangle(150,30,daysUntilNewYear-68,20);
      g2.setColor(Color.ORANGE);
      g2.fill(box);
      g2.setColor(Color.BLACK);
      g2.draw(box);
    g2.drawString("Max", 25, 50);

//Andrei
    Rectangle boxx = new Rectangle(150,60,daysUntilNewYear-68,20);
      g2.setColor(Color.ORANGE);
      g2.fill(boxx);
      g2.setColor(Color.BLACK);
      g2.draw(boxx);
    g2.drawString("Andrei", 25, 80);

//Paul
    Rectangle boxxx = new Rectangle(150,90,daysUntilNewYear-146,20);
      g2.setColor(Color.ORANGE);
      g2.fill(boxxx);
      g2.setColor(Color.BLACK);
      g2.draw(boxxx);
    g2.drawString("Paul", 25, 110);

//Dennis
    Rectangle boxxxx = new Rectangle(150,120,daysUntilNewYear-146,20);
      g2.setColor(Color.ORANGE);
      g2.fill(boxxxx);
      g2.setColor(Color.BLACK);
      g2.draw(boxxxx);
    g2.drawString("Dennis", 25, 140);

//Title
    g2.setFont(new Font("Verdana", Font.PLAIN, 18));
    g2.drawString("Time 'till Parta!!", 215, 25);

//Dsicalmer (if no line...)
    g2.setFont(new Font("Verdana", Font.PLAIN, 8));
    g2.drawString("If no line is drawn: Birthday, this year, has passed.", 45, 170);

  }
}
