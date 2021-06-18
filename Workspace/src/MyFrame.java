import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLine;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.geom.Line2D;
import java.awt.Graphics2D;

public class MyFrame extends JFrame {
    public MyFrame(){
        JPanel panel=new JPanel();
        getContentPane().add(panel);
        setSize(600, 600);

    }

    public void paint(Graphics g) {
        // g.setColor(new Color(255, 0, 0));
        Graphics2D g2 = (Graphics2D) g;
        g.translate(300, 300);
        Line2D lin = new Line2D.Float(-300, 0, 300, 0);
        Line2D line = new Line2D.Float (0, 300, 0, -300);
        g2.draw(lin);
        g2.draw(line);

        for (int x = -300; x < 600; x++) {
            if (x!=0) {
                //int y = (int)((x*x) + (1.0/x));
                int y = (int)(1.0/x);
                g2.drawOval(x, -y / 10, 3, 3);
                g2.fillOval(x, -y / 10, 3, 3);
            }
        }
        
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("Graph");
        JLabel label = new JLabel("Graph");
        
        MyFrame my = new MyFrame();
        my.setVisible(true);
    }
}
