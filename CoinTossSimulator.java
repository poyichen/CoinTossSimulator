// Name: Po-Yi Chen
// USC NetID: poyichen
// CS 455 PA1
// Spring 2019

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
   @param trials  the number of trials of Coin Toss
   @param numOfTwoHeads  the number of two heads result
   @param numOfTwoTails  the number of two hails result
   @param numOfHeadTails  the number of a head and a tail result
 * 
 */

import java.util.Random; 
public class CoinTossSimulator {
   private int trials, numOfTwoHeads, numOfTwoTails, numOfHeadTails;
   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {
      trials = 0;
      numOfTwoHeads = 0;
      numOfTwoTails = 0;
      numOfHeadTails = 0;
      Random tossResults = new Random();
   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
      @param coinA & coinB represent the results, true: Head; false: Tail 
    */
   public void run(int numTrials) { 
      trials += numTrials;
      for (int test = 1; test <= numTrials; test++) {
         boolean coinA = tossResults.nextBoolean();
         boolean coinB = tossResults.nextBoolean();
         if (coinA && coinB) {
            numOfTwoHeads += 1;
         }
         else if (!coinA && !coinB) {
            numOfTwoTails += 1;
         }
         else {
            numOfHeadTails += 1;
         }
      }
   }


   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
      return getTwoHeads() + getTwoTails() + getHeadTails();
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
      return numOfTwoHeads;
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
      return numOfTwoTails;
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
      return numOfHeadTails;
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {
      trials = 0;
      numOfTwoHeads = 0;
      numOfTwoTails = 0;
      numOfHeadTails = 0;
   }
}
