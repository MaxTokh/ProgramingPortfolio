import javax.swing.*;

public class FaceViewer {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(550,550);
    frame.setTitle("Aahhh!!");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FaceComponent component = new FaceComponent();
    frame.add(component);

    frame.setVisible(true);
  }
}
