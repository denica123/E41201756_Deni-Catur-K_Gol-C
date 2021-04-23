
package minggu7;
import java.awt.*;
import java.applet.*;

/**
 *
 * @author denic
 */
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    public void init(){
        
        //The Font is Arial size, 18 and is italicized
        font = new Font("Arial", Font.ITALIC,18);
        
        //Some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        //Colors can be created using red.green,blue green
        blueColor = new Color(0,0,122);
        
        //setBackground Color of the applet
        setBackground(backgroundColor);        
    }
    
    public void stop(){
        
    }
    
    public void paint(Graphics graph){
        //set font
        graph.setFont(font);
        
        //create a tittle
        graph.drawString("Draw Shapes",90,20 );
        
        //set the color for the first shape
        graph.setColor(blueColor);
        
        //Draw a rectangle using drawRect(int x, int y,int width, int height)
        graph.drawRect(120, 120, 120, 120);
        
        //this will fill a retangle
        graph.fillRect(115, 115, 90, 90);
        
        //set the color for the next shape
        graph.setColor(redColor);
        
        //Draw a circle using drawArc(int x, int y, int width, int height,int startAngle, intarcAngle)
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
        //Set color for next shape
        graph.setColor(Color.CYAN);
        
        //Draw another retangle
        graph.drawRect(50, 50, 50, 50);
        
        //this will fill a retangle
        graph.fillRect(50,50,60,60);       
    }
    
}
