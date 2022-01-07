import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image lisbeth;
    JButton start;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.white);
        lisbeth = new ImageIcon("LisbethIconNoBack.png").getImage();

        start = new JButton("   START   ");
        start.setBounds(1, 1, 1,1 );
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                test();

            }
        });
        this.add(start);
    }

    public void paint(Graphics g) {

        super.paint(g); // paint background

        Graphics2D g2D = (Graphics2D) g;    // how we get the graphics in

        g2D.drawImage(lisbeth, 0, 0, null); // the graphics we want to bring in.

    }

    public void test() {

        lisbeth.flush();
        this.repaint();
        this.removeAll();
        new Intro();

    }

}
