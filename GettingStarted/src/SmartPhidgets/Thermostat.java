package SmartPhidgets;

import com.phidget22.*;


public class Thermostat {

	public static void main(String[] args) throws Exception {
		
		//Variable initialization
		int desired_temp = 21;
		int time_counter = 0;
		int stateGreen = 0;
		int stateRed = 0;
        
		//Object creation
	    DigitalInput redButton = new DigitalInput();
	    DigitalInput greenButton = new DigitalInput();
		TemperatureSensor temperatureSensor = new TemperatureSensor();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalOutput greenLED = new DigitalOutput();

	    //Addressing the objects
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    greenButton.setHubPort(5);
	    greenButton.setIsHubPortDevice(true);
	    redButton.setHubPort(0);
	    redButton.setIsHubPortDevice(true);
	    
	    //Opening the objects
        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        redButton.open(1000);

	    //Main body of code
	    while (true) {
	    	//If the green button is pressed, the desired temperature goes up by 1
	    	if (greenButton.getState() == true) {
	    		if (stateGreen == 0) {
		    		stateGreen = 1;
		    		desired_temp += 1;
	    		}
	    	} else {
	    		stateGreen = 0;
	    	}
	    	//If the red button is pressed, the desired temperature goes down by 1
	    	if (redButton.getState() == true) {
	    		if (stateRed == 0) {
		    		stateRed = 1;
		    		desired_temp -= 1;
	    		}
	    	} else {
	    		stateRed = 0;
	    	}
	    	
	    	//Prints out the current and desired temperature every ten seconds
	    	if (time_counter == 100) {
	    		System.out.println("Set temperature: " + desired_temp + " °C, current temperature: " + temperatureSensor.getTemperature() + " °C.");
	    		time_counter = 0;
	    	}
	    	
	    	//Checks if the current temperature is within 2 degrees of the set temperature
	    	if (temperatureSensor.getTemperature() < (desired_temp + 2) && temperatureSensor.getTemperature() > (desired_temp - 2)) {
                greenLED.setState(true);
                redLED.setState(false);
	    	} else {
                greenLED.setState(false);
                redLED.setState(true);
	    	}
            Thread.sleep(100);
            time_counter += 1;//Enables the rest of the code to run while still counting to ten seconds to print the temperatures
	    }

	}

}
