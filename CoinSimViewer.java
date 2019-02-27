// Name: Po-Yi Chen
// USC NetID: poyichen
// CS 455 PA1
// Spring 2019

import javax.swing.JFrame;
import java.util.Scanner;


/**
 * Tester for CoinTossSimulator (GIU)
 * Provide the interface to key trials number (Number entered must be greater than 0)
 * and further initialize the frame & CoinSimComponent
 */
public class CoinSimViewer
{
   public static void main(String[] args)
   {
      int setTrials;
      Scanner in = new Scanner(System.in); 
      
      System.out.print("Enter number of trials: ");
      setTrials = in.nextInt();
      while (setTrials < 1) {
         System.out.println("ERROR: Number entered must be greater than 0.");
         System.out.print("Enter number of trials: ");
         setTrials = in.nextInt();
      }
          
      JFrame frame = new JFrame();
      frame.setSize(800, 600);
      frame.setTitle("CoinSim");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      CoinSimComponent component = new CoinSimComponent(setTrials);
      frame.add(component);

      frame.setVisible(true);
   }
}
