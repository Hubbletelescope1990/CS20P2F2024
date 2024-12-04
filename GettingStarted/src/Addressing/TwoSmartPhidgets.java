package Addressing;

import com.phidget22.*;

public class TwoSmartPhidgets {

	static int red_Or_Green = 0;
	
	public static void main(String[] args) throws Exception{
		
	    //Create 
        TemperatureSensor temperatureSensor0 = new TemperatureSensor();
        TemperatureSensor temperatureSensor1 = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

         //Address 
         temperatureSensor0.setHubPort(3);
         temperatureSensor1.setHubPort(2);
         redButton.setHubPort(0);
         redButton.setIsHubPortDevice(true);
         greenButton.setHubPort(5);
         greenButton.setIsHubPortDevice(true);
         
         //Event
         redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
             public void onStateChange(DigitalInputStateChangeEvent e) {
         		red_Or_Green = 0;
             }
         });
         
         greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
             public void onStateChange(DigitalInputStateChangeEvent e) {
         		red_Or_Green = 1;
             }
         });

        //Open 
        temperatureSensor0.open(1000);
        temperatureSensor1.open(1000);
        greenButton.open(1000);
        redButton.open(1000);

        //Use your Phidgets 
        while (true) {
        	if (red_Or_Green == 0) {
                System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C" );
        	} else {
                System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C" );
        	}
            Thread.sleep(150);
        }

	}

}
