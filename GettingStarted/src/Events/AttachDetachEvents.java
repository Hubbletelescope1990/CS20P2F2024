package Events;

import com.phidget22.*;

public class AttachDetachEvents {

	public static void main(String[] args) throws Exception{

        //Create
       TemperatureSensor temperatureSensor = new TemperatureSensor();
       DigitalInput redButton = new DigitalInput();
       DigitalOutput redLED = new DigitalOutput();
       
       redButton.setHubPort(0);
       redButton.setIsHubPortDevice(true);
       redLED.setHubPort(1);
       redLED.setIsHubPortDevice(true);

       //Data Event 
       temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
           public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
               //Print temperature
               System.out.println("Temperature: " + e.getTemperature() + "°C");
           }
       });

       //Attach Event 
       temperatureSensor.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Temperature sensor attached");
           }
       });

       //Detach Event 
       temperatureSensor.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Temperature sensor detached");
           }
       });
       
       //Attach Event 
       redButton.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Red button attached");
           }
       });

       //Detach Event 
       redButton.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Red button detached");
           }
       });
       //Attach Event 
       redLED.addAttachListener(new AttachListener() {
           public void onAttach(AttachEvent e) {
               System.out.println("Red LED attached");
           }
       });

       //Detach Event 
       redLED.addDetachListener(new DetachListener() {
           public void onDetach(DetachEvent e) {
               System.out.println("Red LED detached");
           }
       });

       //Open
       temperatureSensor.open(1000);
       redLED.open(1000);
       redButton.open(1000);

       //Keep program running
       while (true) {
           Thread.sleep(150);
       }

	}

}
