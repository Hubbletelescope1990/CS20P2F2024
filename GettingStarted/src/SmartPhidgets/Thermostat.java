package SmartPhidgets;

import com.phidget22.*;


public class Thermostat {

	public static void main(String[] args) throws Exception {
		
		int desired_temp = 21;
		int time_counter = 0;
		int stateGreen = 0;
		int stateRed = 0;
        
	    DigitalInput redButton = new DigitalInput();
	    DigitalInput greenButton = new DigitalInput();
		TemperatureSensor temperatureSensor = new TemperatureSensor();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalOutput greenLED = new DigitalOutput();

	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    greenButton.setHubPort(5);
	    greenButton.setIsHubPortDevice(true);
	    redButton.setHubPort(0);
	    redButton.setIsHubPortDevice(true);
	    
        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        redButton.open(1000);

	    
	    while (true) {
	    	if (greenButton.getState() == true) {
	    		if (stateGreen == 0) {
		    		stateGreen = 1;
		    		desired_temp += 1;
	    		}
	    	} else {
	    		stateGreen = 0;
	    	}
	    	if (redButton.getState() == true) {
	    		if (stateRed == 0) {
		    		stateRed = 1;
		    		desired_temp -= 1;
	    		}
	    	} else {
	    		stateRed = 0;
	    	}
	    	if (time_counter == 100) {
	    		System.out.println("Set temperature: " + desired_temp + " °C, current temperature: " + temperatureSensor.getTemperature() + " °C.");
	    		time_counter = 0;
	    	}
	    	if (temperatureSensor.getTemperature() < (desired_temp + 2) && temperatureSensor.getTemperature() > (desired_temp - 2)) {
                greenLED.setState(true);
                redLED.setState(false);
	    	} else {
                greenLED.setState(false);
                redLED.setState(true);
	    	}
            Thread.sleep(100);
            time_counter += 1;
	    }

	}

}
