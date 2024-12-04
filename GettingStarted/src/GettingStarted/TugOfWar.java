package GettingStarted;

import com.phidget22.*;

public class TugOfWar {

	public static void main(String[] args) throws Exception {
		
		//Variable initialization
		int stateGreen = 0;
		int stateRed = 0;
		int counterRed = 0;
		int counterGreen = 0;
		
		//Object creation
	    DigitalInput redButton = new DigitalInput();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalInput greenButton = new DigitalInput();
	    DigitalOutput greenLED = new DigitalOutput();
	    
	    //Object addressing
	    redButton.setHubPort(0);
	    redButton.setIsHubPortDevice(true);
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenButton.setHubPort(5);
	    greenButton.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    
	    //Object opening
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        //Main body of code
	    while (true) {
	    	if (redButton.getState()) {
                redLED.setState(true);
	    		if (stateRed == 0) {
		    		counterRed += 1;
		    		stateRed = 1;
	    		}
	    	} else {
                redLED.setState(false);
	    		stateRed = 0;
	    	}
	    	
	    	if (greenButton.getState()) {
                greenLED.setState(true);
	    		if (stateGreen == 0) {
		    		counterGreen += 1;
		    		stateGreen = 1;
	    		}
	    	} else {
                greenLED.setState(false);
	    		stateGreen = 0;
	    	}
	    	//Goes to the win sequence
	    	if (counterGreen == 10 || counterRed == 10) {
                Thread.sleep(100);
                greenLED.setState(false);
                redLED.setState(false);
                Thread.sleep(1000);
                greenLED.setState(true);
                redLED.setState(true);
                Thread.sleep(1000);
                greenLED.setState(false);
                redLED.setState(false);
                Thread.sleep(1000);
                
                //Checks if green or red won
                if (counterGreen == 10) {
                	for (int i = 0; i < 5; i++) {
                        greenLED.setState(true);
                        Thread.sleep(500);
                        greenLED.setState(false);
                        Thread.sleep(500);
                	}
                } else {
                	for (int i = 0; i < 5; i++) {
                        redLED.setState(true);
                        Thread.sleep(500);
                        redLED.setState(false);
                        Thread.sleep(500);
                	}
                }
                break;//Ends code to prevent it from running again
	    	}
	    }


	}

}
