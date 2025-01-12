package sensor;

public class HumiditySensor implements ISensor {
	private double humidity; 

	public HumiditySensor(double humidity) {
		this.humidity = humidity;
	}

	@Override
	public double get() {
		return this.humidity;
	}

}
