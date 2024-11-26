package GettingStarted;

import com.phidget22.DigitalOutput;

public class LEDBlink {
	
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        greenLED.open(1000);

        //Use your Phidgets 
        for (int i = 0; i < 3; i++) {
            greenLED.setState(true);
            Thread.sleep(1000);
            greenLED.setState(false);
            Thread.sleep(1000);
        }
    }
}
