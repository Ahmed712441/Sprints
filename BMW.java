import java.util.Date;

public class BMW extends Car{
	
	
	private int waranty_yeras ;
	private Date sell_date;
	private String owner_name ;
	private String motor ;
	
	
	

	BMW(int fuelpercentage, String type, String fueltype, int price,String owner_name,String motor) {
		super(fuelpercentage, type, fueltype, price);
		sell_date = new Date();
		waranty_yeras = 0;
		this.owner_name = owner_name;
		this.motor = motor;
	}
	
	BMW(int fuelpercentage, String type, String fueltype, int price,String color,String owner_name,String motor) {
		super(fuelpercentage, type, fueltype, price,color);
		sell_date = new Date();
		waranty_yeras = 0;
		this.owner_name = owner_name;
		this.motor = motor;
	}
	
	BMW(int fuelpercentage, String type, String fueltype, int price,String owner_name,String motor,int waranty_yeras) {
		super(fuelpercentage, type, fueltype, price);
		sell_date = new Date();
		this.waranty_yeras = waranty_yeras;
		this.owner_name = owner_name;
		this.motor = motor;
	}
	
	BMW(int fuelpercentage, String type, String fueltype, int price,String color,String owner_name,String motor,int waranty_yeras) {
		super(fuelpercentage, type, fueltype, price,color);
		sell_date = new Date();
		this.waranty_yeras =waranty_yeras ;
		this.owner_name = owner_name;
		this.motor = motor;
		
		
	}

	public int getWaranty_yeras() {
		return waranty_yeras;
	}

	public void setWaranty_yeras(int waranty_yeras) {
		this.waranty_yeras = waranty_yeras;
	}

	public Date getSell_date() {
		return sell_date;
	}



	public String getOwner_name() {
		return owner_name;
	}



	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	
	
	
}
