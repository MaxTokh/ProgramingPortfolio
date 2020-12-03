import java.awt.*;
import javax.swing.JComponent;
import java.util.Scanner;
import java.awt.geom.Ellipse2D;

public class FaceComponent extends JComponent {
  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Ellipse2D.Double ellipse = new Ellipse2D.Double(25, 25, 200, 200);
    g2.draw(ellipse);

    Ellipse2D.Double ellipsee = new Ellipse2D.Double(75, 85, 20, 20);
    g2.draw(ellipsee);

    Ellipse2D.Double ellipseee = new Ellipse2D.Double(150, 85, 20, 20);
    g2.draw(ellipseee);

    Rectangle box = new Rectangle(125, 150, 25, 0);
    g2.draw(box);

  }
}

/*
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
    }
  }
  - - -
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
*/
