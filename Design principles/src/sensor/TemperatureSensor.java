package sensor;

public class TemperatureSensor implements ISensor{

	private double temperature; 

	public TemperatureSensor(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public double get() {
		return this.temperature;
	}

}
