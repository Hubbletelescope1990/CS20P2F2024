package GettingStarted;

import com.phidget22.*;

public class LEDButtons {

	public static void main(String[] args) throws Exception{
		
		int counter = 0;
		int lever = 0;
		int stateGreen = 0;
		int stateRed = 0;
		
        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets 
        System.out.println(counter);
        while(true){

            if( redButton.getState()){
                redLED.setState(true);
                if (stateRed == 0 && lever == 0) {
                    counter += 1;
                	lever = 1;
                	stateRed = 1;
                }
            } else {
                redLED.setState(false);
                stateRed = 0;
            }

            if(greenButton.getState()){
                greenLED.setState(true);
                if (stateGreen == 0 && lever == 0) {
                    counter += 1;
                	lever = 1;
                	stateGreen = 1;
                }
            } else {
                greenLED.setState(false);
                stateGreen = 0;
            }
            if (lever == 1) {
            	System.out.println(counter);
            	lever = 0;
            }

        }

	}

}
