package refactor;


public class SalesEmployee extends Employee {
	private float commissionRate;
	private int salesMade;
	
	public SalesEmployee (String name, float salary, 
	      float commissionRate, int salesMade){
		super(name, salary);
		this.commissionRate = commissionRate;
		this.salesMade = salesMade;
	}
	
	private float variableComponent() {
		return salesMade*commissionRate;
	}
	
	public  float computeSalary(){
		return getBaseSalary() 
				- computeDeductions() + variableComponent();
	}
}
