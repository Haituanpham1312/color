package vn;
 
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
 
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
 
public class JColorChooserExam1 extends JFrame 
        implements ActionListener {
    JButton b;
    Container c;
    private Graphics g;
    public int x0,y0,x1,y1;
    JColorChooserExam1() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
 
        b = new JButton("color");
        b.addActionListener(this);
 
        c.add(b);
    
    }
    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, 
                "Select a color", initialcolor);
        c.paint(g);
    }
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        x0=e.getX();
        y0=e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        x1=e.getX();
        y1=e.getY();
        Graphics2D g=(Graphics2D)this.getGraphics();
        g.setColor(Color.green);
        g.setStroke(new BasicStroke(5.0F));
        g.drawLine(x0, y0, x1, y1);
        x0=x1;
        y0=y1;
    }

    public void mouseMoved(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

