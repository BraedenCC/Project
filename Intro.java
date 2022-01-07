import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Intro extends JPanel{

    Image lisbeths;

    Intro() {

        this.setBackground(Color.white);
        lisbeths = new ImageIcon("LisbethIconNoBackSmall.png").getImage();

    }
    public void paint(Graphics h) {

        Graphics2D h2D = (Graphics2D) h;    // how we get the graphics in

        h2D.setPaint(Color.blue);
        h2D.drawRect(10, 10, 10, 10);

        h2D.drawImage(lisbeths, 1, 1, null); // the graphics we want to bring in.
    }

}
