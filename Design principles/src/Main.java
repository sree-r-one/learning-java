
import sensor.HumiditySensor;
import sensor.TemperatureSensor;
import sensor.ISensor;

public class Main {

	public static void main(String[] args) {

		ISensor humiditySensor = new HumiditySensor(22);
		ISensor temperatureSensor = new TemperatureSensor(45);


		System.out.println("Humidity: " + humiditySensor.get());
		System.out.println("Temperature: " + temperatureSensor.get());

	}

}
