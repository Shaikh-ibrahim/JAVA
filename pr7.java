import java.applet.Applet;
import java.awt.Graphics;

public class pr7   {
    public void paint(Graphics g){
        g.setColor(java.awt.Color.yellow);
        g.fillOval(50,50,200,200);
         g.setColor(java.awt.Color.white);
         g.fillOval(100,100,40,40);
         g.fillOval(160,100,40,40);
         g.setColor(java.awt.Color.red);
         g.drawArc(100,120,100,60,0,-180);
    }
    
}
