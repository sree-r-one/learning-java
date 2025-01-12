
public class Sensor {

	private double humidity; 
	private double temperature; 


	public Sensor(double humidity, double temperature){
		this.humidity = humidity; 
		this.temperature = temperature; 
	}
	/**
	 * Retrieves data based on provided control flag 
	 * 
	 */

	 public double get(int controlFlag){
		switch (controlFlag) {
			case 0:
				return this.humidity; 
			
			case 1:
				return this.temperature;
				
			default:
				throw new IllegalArgumentException("Unknown Control Flag: "+controlFlag);
		}
	 }




}
