package product;

public class ClothingProduct extends Product {
	
	private int size;
    private String color;

    public ClothingProduct(String name, double price, int size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + getName() + " - Size: " + getSize() + " - Color: " + getColor();
    }

    public void wash() {
        System.out.println("Washing " + getName());
    }
    
    public int getSize() {
    	return size;
    }
    
    public String getColor() {
    	return color;
    }

}
