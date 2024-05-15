package product;

public class ElectronicsProduct extends Product {
	private String brand;
	private String model;

	public ElectronicsProduct(String name, double price, String brand, String model) {
		super(name, price);
		this.brand = brand;
		this.model = model;
	}

	@Override
	public String getDescription() {
		return "Electronics: " + getName() + " - Brand: " + getBrand() + " - Model: " + getModel();
	}

	public void repair() {
		System.out.println("Repairing " + getName());
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
}
