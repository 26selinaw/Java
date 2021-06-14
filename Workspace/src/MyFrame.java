import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLine;

public class MyFrame {
    public static void main(String s[]) {
        JFrame frame = new JFrame("Graph");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Graph");


        //JButton button = new JButton();
        //button.setText("Button");
        panel.add(label);
        //panel.add(button);
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
    public void paint(Graphics gp) { super.paint(gp); Graphics2D graphics = (Graphics2D) gp;
        Line2D line = new Line2D.Float(200, 150, 150, 220);
        graphics.draw(line);
    }
}