package Methods;

import com.phidget22.*;

public class LEDBrightness {

	public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle
        
        for (double i = 1; i <= 10; i++) {
        	redLED.setDutyCycle((i / 10));
        	Thread.sleep(500);
        }
  
        for (double a = 10; a >= 0; a--) {
        	redLED.setDutyCycle((a / 10));
        	Thread.sleep(500);
        }


	}

}
