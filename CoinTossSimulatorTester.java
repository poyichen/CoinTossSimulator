// Name: Po-Yi Chen
// USC NetID: poyichen
// CS 455 PA1
// Spring 2019

import java.util.Scanner;

/**
 * Tester for CoinTossSimulator ()
 * Execute in the following sequence to test whether the class method is correct or not
 * Run(1), Run(10), Run(100), reset, Run(1000)
 */

public class CoinTossSimulatorTester {
   public static void main(String[] args) {
       // Declare variables
       int numTrials = 0;
       int setTrials = 0;
       int funcCode = 1;
       boolean tossResults = true;
       Scanner in = new Scanner(System.in);
       CoinTossSimulator CoinTest = new CoinTossSimulator();
       System.out.println("After Constructor:");
       System.out.println("Number of trials [exp:0]: " + CoinTest.getNumTrials());
       System.out.println("Two-head tosses: " + CoinTest.getTwoHeads());
       System.out.println("Two-tail tosses: " + CoinTest.getTwoTails());
       System.out.println("One-head one-tail: " + CoinTest.getHeadTails());
       System.out.println("Tosses add up correctly? " + tossResults);
       System.out.println("");
       
       CoinTest.run(1);
       System.out.println("After run(1):");
       System.out.println("Number of trials [exp:1]: " + CoinTest.getNumTrials());
       System.out.println("Two-head tosses: " + CoinTest.getTwoHeads());
       System.out.println("Two-tail tosses: " + CoinTest.getTwoTails());
       System.out.println("One-head one-tail: " + CoinTest.getHeadTails());
       System.out.println("Tosses add up correctly? " + tossResults);
       System.out.println("");
       
       CoinTest.run(10);
       System.out.println("After run(10):");
       System.out.println("Number of trials [exp:11]: " + CoinTest.getNumTrials());
       System.out.println("Two-head tosses: " + CoinTest.getTwoHeads());
       System.out.println("Two-tail tosses: " + CoinTest.getTwoTails());
       System.out.println("One-head one-tail: " + CoinTest.getHeadTails());
       System.out.println("Tosses add up correctly? " + tossResults);
       System.out.println("");
       
       CoinTest.run(100);
       System.out.println("After run(100):");
       System.out.println("Number of trials [exp:111]: " + CoinTest.getNumTrials());
       System.out.println("Two-head tosses: " + CoinTest.getTwoHeads());
       System.out.println("Two-tail tosses: " + CoinTest.getTwoTails());
       System.out.println("One-head one-tail: " + CoinTest.getHeadTails());
       System.out.println("Tosses add up correctly? " + tossResults);
       System.out.println("");
       
       CoinTest.reset();
       System.out.println("After reset:");
       System.out.println("Number of trials [exp:0]: " + CoinTest.getNumTrials());
       System.out.println("Two-head tosses: " + CoinTest.getTwoHeads());
       System.out.println("Two-tail tosses: " + CoinTest.getTwoTails());
       System.out.println("One-head one-tail: " + CoinTest.getHeadTails());
       System.out.println("Tosses add up correctly? " + tossResults);
       System.out.println("");
       
       CoinTest.run(1000);
       System.out.println("After run(1000):");
       System.out.println("Number of trials [exp:1000]: " + CoinTest.getNumTrials());
       System.out.println("Two-head tosses: " + CoinTest.getTwoHeads());
       System.out.println("Two-tail tosses: " + CoinTest.getTwoTails());
       System.out.println("One-head one-tail: " + CoinTest.getHeadTails());
       System.out.println("Tosses add up correctly? " + tossResults);
       System.out.println("");
       
   }
}