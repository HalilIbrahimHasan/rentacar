

import java.io.Serializable;

import rentacar.Location;

public class Car extends Location implements Serializable{

	private static int id =1000;
	private String carId;
	private String make;
	private String model;
	private String carClassification ; //Car Class (SUV, sedan)
	private String sizeOfCar;           // Type of Car (economy, midsize, luxury)
	private String numberOfSeats;	
	
	public Car() {		
	}
	public Car(String make,String model) {	
		this.make = make;
		this.model = model;
		setCarId();
	}
	public void setCarId() {
		id++;		
		this.carId ="C"+id; // 2 1003--- 21003
	}	
	public String getCarId() {
		return carId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
    public String toString() {
        return "\nCar Id:" + carId + "\nMake: " + make + "\nModel: " + model+ "\nCar classification: " + 
    carClassification + "\nSize of car: " + sizeOfCar + "\nNumber of seats: " +numberOfSeats +"\n";
    }

	
}
