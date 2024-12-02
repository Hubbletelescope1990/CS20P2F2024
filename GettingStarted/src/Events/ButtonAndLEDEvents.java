package Events;

import com.phidget22.*;

public class ButtonAndLEDEvents {
    //Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false;
    static boolean turnGreenLEDOn = false;

	public static void main(String[] args) throws Exception{
		
		int Redcounter = 0;
		int Greencounter = 0;
		int stateGreen = 0;
		int stateRed = 0;
		

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the red LED
                turnRedLEDOn = e.getState(); 
            }
        });

        //Event 
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the green LED
                turnGreenLEDOn = e.getState();
            }
        });

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        //Use your Phidgets 
        while(true) {
            //turn red LED on based on red button input
            //turn green LED on based on green button input
            //sleep for 150 milliseconds 
            
            if(turnRedLEDOn == true){
                redLED.setState(true);
                if (stateRed == 0 && stateRed == 0) {
                    Redcounter += 1;
                	stateRed = 1;
                }
            } else {
                redLED.setState(false);
                stateRed = 0;
            }

            if(turnGreenLEDOn == true){
                greenLED.setState(true);
                if (stateGreen == 0 && stateGreen == 0) {
                    Greencounter += 1;
                	stateGreen = 1;
                }
            } else {
                greenLED.setState(false);
                stateGreen = 0;
            }
            //Need to test the button counter and setup win condition(number 4)
        }
		

	}

}
