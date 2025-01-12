
//import sensor.HumiditySensor;
// import sensor.TemperatureSensor;
// import sensor.ISensor;
import designPatterns.Singleton;

public class Main {

	public static void main(String[] args) {

//		ISensor humiditySensor = new HumiditySensor(22);
//		ISensor temperatureSensor = new TemperatureSensor(45);
//
//
//		System.out.println("Humidity: " + humiditySensor.get());
//		System.out.println("Temperature: " + temperatureSensor.get());

		Singleton singleton1 = Singleton.getSingleton();

		singleton1.log("message from singleton 1");

		Singleton singleton2 = Singleton.getSingleton(); 
		System.out.println("SAME or ? : " + (singleton1 == singleton2));
		
	}

}
