import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();    // shrinks the window for no extra space without things cutting out
        this.setLocationRelativeTo(null); // Allows frame to appear in the MIDDLE of the screen
        this.setVisible(true);

    }
}
