package bd_methods_classes;

public class Cars {
	
	private String make;
	private String model;
	private String color;
	private int makeYear;
	private int mileage;
	private String transmission;
	
	public Cars(String make, String model, String color, int makeYear, int mileage, String transmission){
		this.make = make;
		this.model = model;
		this.color = color;
		this.makeYear = makeYear;
		this.mileage = mileage;
		this.transmission = transmission;
	}
/*
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	

	public String getModel() {
		return model;
	}

	public void setModel(String model){
		this.model = model;
	}
	
	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}	
	
	public int getMakeYear(){
		return makeYear;
	}

	public void setMakeYear(int makeYear){
		this.makeYear = makeYear;
	}

	public int getMileage(){
		return mileage;
	}

	public void setMileage(int mileage){
		this.mileage = mileage;
	}

	public String getTransmission(){
		return transmission;
	}
	
public void setTransmission(String transmission){
		this.transmission = transmission;
	}
*/
	
	public static void main(String[] args){
		Cars Dan = new Cars("Porsche", "911T", "White", 2010, 12735, "manual");
		
		System.out.println("Hi, my name is Dan and I have a " + Dan.color + " " + Dan.makeYear 
		 + " " + Dan.make+ " " + Dan.model + " that is a " + Dan.transmission + " transmission and has " +
				Dan.mileage + " miles on it.");
	}
}