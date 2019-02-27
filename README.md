## USC CSCI455x Project1: CoinSimulator

**CoinSimViewer.java:**  
Contains the main method. Prompts for the number of trials, and creates the JFrame containing the CoinSimComponent. Besides CoinSimComponent, this class does not depend on any of the other classes.

**CoinSimComponent.java:**
Extends JComponent. Constructor initializes any necessary data and runs the simulation. Overrides paintComponent to draw the bar graph, using Bar objects for each bar in the graph. This class uses the CoinTossSimulator and Bar class.

**CoinTossSimulator.java:**   
This is the class responsible for doing the simulation. It has no graphical output, and in fact, does no I/O to the console either. It has a run method to run a simulation of tossing a pair of coins for some number of trials. It has accessors to get the results of the simulation. Subsequent calls to run add trials to the current simulation. To reset the CoinTossSimulator to start a new simulation, call the reset method.

**Bar.java:**   
For drawing a bar in a bar graph.

**CoinTossSimulatorTester.java:**  
A program to test the CoinTossSimulator class independently from its use in the CoinSimViewer program.
