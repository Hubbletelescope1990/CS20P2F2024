package SmartPhidgets;

import com.phidget22.*;


public class TemperatureAndHumidity {

	public static void main(String[] args) throws Exception{

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        HumiditySensor humiditySensor = new HumiditySensor();

        //Open 
        temperatureSensor.open(1000);
        humiditySensor.open(1000);

        //Use your Phidgets 
        while (true) {
        	if (humiditySensor.getHumidity() < 30) {
        		System.out.println("Humidity: Low humidity, Temperature: " + temperatureSensor.getTemperature() + " °C" );
                Thread.sleep(150);
        	} else {
        		System.out.println("Humidity: " + humiditySensor.getHumidity() + " %RH, Temperature: " + temperatureSensor.getTemperature() + " °C" );
        		Thread.sleep(150);
        	}
        }

	}

}
