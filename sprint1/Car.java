
public abstract class Car {

	protected int fuelpercentage;
	protected String type;
	protected String fueltype;
	protected int price;
	protected String color;
	
	Car(int fuelpercentage,String type,String fueltype,int price){
		this.fuelpercentage =fuelpercentage;
		this.type = type;
		this.fueltype = fueltype;
		this.price = price;
		this.color = "white";
	}
	Car(int fuelpercentage,String type,String fueltype,int price,String color){
		this.fuelpercentage =fuelpercentage;
		this.type = type;
		this.fueltype = fueltype;
		this.price = price;
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getFuelpercentage() {
		return fuelpercentage;
	}

	public void setFuelpercentage(int fuelpercentage) {
		if(fuelpercentage<100) {
		this.fuelpercentage = fuelpercentage;
	
		}else {
			this.fuelpercentage = 100;
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
