// Name: Po-Yi Chen
// USC NetID: poyichen
// CS 455 PA1
// Spring 2019

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;

/**
   This component draws results of coin toss.
*/
public class CoinSimComponent extends JComponent
   {
   /** 
   @param numTrials  the total number of trials of Coin Toss
   @param numOfTwoHeads  the number of two heads result
   @param numOfTwoTails  the number of two hails result
   @param numOfHeadTails  the number of a head and a tail result
   @param percentTwoHeads  the percentage of two heads result
   @param percentTwoTails  the percentage of two hails result
   @param percentHeadTails  the percentage of a head and a tail result
   */
   private int numTrials, numTwoHeads, numTwoTails, numHeadTails; 
   private int percentTwoHeads, percentTwoTails, percentHeadTails;
   
   /**
      CoinSimComponent constructor. Receive number of trails, run simulation and
      record simulation results
   */
   public CoinSimComponent(int numTrials) {
      int PERCENT = 100;
      CoinTossSimulator CoinTest = new CoinTossSimulator();
      CoinTest.run(numTrials);
     
      this.numTrials = CoinTest.getNumTrials();
      numTwoHeads = CoinTest.getTwoHeads();
      numTwoTails = CoinTest.getTwoTails();
      numHeadTails = CoinTest.getHeadTails();

      percentTwoHeads = (int)Math.round(((double)numTwoHeads * PERCENT / numTrials));   
      percentTwoTails = (int)Math.round(((double)numTwoTails * PERCENT / numTrials));
      percentHeadTails = (int)Math.round(((double)numHeadTails * PERCENT / numTrials));
   }
   
   public void paintComponent(Graphics g) {
      /** 
      Calculate all essential elements for graphics
      
      @param BAR_WIDTH  bar width, and it is a fixed value = 60 (px) in this program
      @param VERTICAL_BUFFER  vertical buffer, and it is a fixed value = 20 (px) in this program
      @param bottomOfLabel  location of the bottom of the label  
      @param x_Space  the space which divided horizontal space evenly
      @param leftOfBar  location of the left side of the bar    
      @param LABEL_WIDTH  label width, and it is a fixed value = 13 (px) in this program  
      @param sacle  how many pixels per application unit
      @param labelOfTwoHeads, labelOfTwoTails, labelOfHeadTails  label used for each bar
      @param HEAD_TAIL_COLOR  color of bar
      */
      int BAR_WIDTH, VERTICAL_BUFFER, bottomOfLabel, x_Space, leftOfBar, LABEL_WIDTH;
      double scale;
      String labelOfTwoHeads, labelOfTwoTails, labelOfHeadTails;
      Color HEAD_TAIL_COLOR;
      
      Graphics2D g2 = (Graphics2D) g;      
      BAR_WIDTH = 60;
      VERTICAL_BUFFER = 20;
      LABEL_WIDTH = 13;
      bottomOfLabel = getHeight() - VERTICAL_BUFFER;
      x_Space = getWidth() / 4;
      leftOfBar = x_Space - BAR_WIDTH / 2;
      scale = (double) (getHeight() - VERTICAL_BUFFER * 2 - LABEL_WIDTH) / numTrials;
       
      // create bar object
      labelOfTwoHeads = "Two Heads: " + numTwoHeads + " (" + percentTwoHeads + "%)";
      HEAD_TAIL_COLOR = Color.RED;
      Bar barTwoHeads = new Bar(bottomOfLabel, leftOfBar, BAR_WIDTH, numTwoHeads, scale, HEAD_TAIL_COLOR, labelOfTwoHeads);
      
      labelOfHeadTails = "A Head and a Tail: " + numHeadTails + " (" + percentHeadTails + "%)";     
      leftOfBar += x_Space;
      HEAD_TAIL_COLOR = Color.GREEN;
      Bar barHeadTails = new Bar(bottomOfLabel, leftOfBar, BAR_WIDTH, numHeadTails, scale, HEAD_TAIL_COLOR, labelOfHeadTails);
      
      labelOfTwoTails = "Two Tails: " + numTwoTails + " (" + percentTwoTails + "%)";
      leftOfBar += x_Space;
      HEAD_TAIL_COLOR = Color.BLUE;
      Bar barTwoTails = new Bar(bottomOfLabel, leftOfBar, BAR_WIDTH, numTwoTails, scale, HEAD_TAIL_COLOR, labelOfTwoTails);
          
      // draw bar
      barTwoHeads.draw(g2);
      barHeadTails.draw(g2);   
      barTwoTails.draw(g2);
   }
}