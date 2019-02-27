// Name: Po-Yi Chen
// USC NetID: poyichen
// CS 455 PA1
// Spring 2019

// we included the import statements for you
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the label is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */
public class Bar {

   /**
      Creates a labeled bar.  You give the height of the bar in application
      units (e.g., population of a particular state), and then a scale for how
      tall to display it on the screen (parameter scale). 
  
      @param bottom  location of the bottom of the label
      @param left  location of the left side of the bar
      @param width  width of the bar (in pixels)     
      @param barHeight  height of the bar in application units
      @param scale  how many pixels per application unit
      @param color  the color of the bar
      @param label  the label at the bottom of the bar
   */
   private int bottom, left, width, barHeight;
   private double scale;
   private Color color;
   private String label;
    
   public Bar(int bottom, int left, int width, int barHeight,
              double scale, Color color, String label) {
      this.bottom = bottom;
      this.left = left;
      this.width = width;
      this.barHeight = barHeight;
      this.scale = scale;
      this.color = color;
      this.label = label;
   }
   
   /**
      Draw the labeled bar. 
      @param height  height of the bar (in pixels)
      @param widthOfLabel  the width of label 
      @param heightOfLabel  the height of label 
      @param x_label  the the origin x-coordinate of label 
      @param y_label  the the origin y-coordinate of label 
      @param x_bar  the the origin x-coordinate of bar  
      @param y_bar  the the origin y-coordinate of bar 
      @param g2  the graphics context 
   */
   public void draw(Graphics2D g2) {
      int height, widthOfLabel, heightOfLabel, x_label, y_label, x_bar, y_bar;
      
      Font font = g2.getFont();
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D labelBounds = font.getStringBounds(label, context);
      widthOfLabel = (int)labelBounds.getWidth();
      heightOfLabel = (int)labelBounds.getHeight();
      // draw label
      x_label = left + (width / 2) - (widthOfLabel / 2);
      y_label = bottom;
      g2.setColor(Color.BLACK);
      g2.drawString(label, x_label, y_label);
      // draw bar
      x_bar = left;
      y_bar = (int)(bottom - heightOfLabel - barHeight * scale);
      height = (int)(barHeight * scale);
      Rectangle bar = new Rectangle(x_bar, y_bar, width, height);
      g2.setColor(color);
      g2.fill(bar);
   }   
}
