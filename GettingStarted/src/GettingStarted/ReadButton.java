package GettingStarted;

import com.phidget22.*;

public class ReadButton {

	public static void main(String[] args) throws Exception{
		
		int state = 0;
        
        //Create 
        DigitalInput redButton = new DigitalInput();

        //Address 
        redButton.setHubPort(5);
        redButton.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);

        //Use your Phidgets 
        while(true){
        	if (redButton.getState() == true && state == 1) {
                System.out.println("Button State: true");
                state = 0;
        	}
        	if (redButton.getState() == false && state == 0) {
        		System.out.println("Button State: false");
        		state = 1;
        	}
        }

	}

}
