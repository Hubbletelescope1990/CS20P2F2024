package Events;

import com.phidget22.*;

public class ButtonEvents {

	public static void main(String[] args) throws Exception{
		
        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);

        //Event 
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	if (e.getState() == true) {
            		System.out.println("Red button pressed");
            	} else {
            		System.out.println("Red button not pressed");
            	}
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
            	if (e.getState() == true) {
            		System.out.println("Green button pressed");
            	} else {
            		System.out.println("Green button not pressed");
            	}
            }
        });

        //Open
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(5000);
        }

	}

}
