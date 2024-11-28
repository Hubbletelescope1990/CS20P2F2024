package SmartPhidgets;

import com.phidget22.*;

public class HotOrCold {

	public static void main(String[] args) throws Exception {
		
        TemperatureSensor temperatureSensor = new TemperatureSensor();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalOutput greenLED = new DigitalOutput();

	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);

	    
	    while (true) {

	    	if (temperatureSensor.getTemperature() < 24 && temperatureSensor.getTemperature() > 20) {
                greenLED.setState(true);
                redLED.setState(false);
	    	} else {
                greenLED.setState(false);
                redLED.setState(true);
	    	}
	    	System.out.println("Temperature is: " + temperatureSensor.getTemperature() + " °C");
            Thread.sleep(150);
	    }
	}

}
