package Events;

import com.phidget22.*;

public class DataInterval {

	public static void main(String[] args) throws Exception{


        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        //Temperature Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature());
            }
        });

        //Open
        temperatureSensor.open(5000);
        redButton.open(5000);
        redLED.open(5000);
        //Set Data Interval 
        temperatureSensor.setDataInterval(500);//As can be seen, an error occurs
        /*I have put this line of code in comments because it will cause an error otherwise.
        redButton.setDataInterval(500);//This is because the LED is an output, and the button is an input
        redLED.setDataInterval(500);//and for neither of which is setDataInterval defined for.
        */
        //Keep program running
        while (true) {
            Thread.sleep(150);
        }

	}

}
