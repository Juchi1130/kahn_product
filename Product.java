
public class Product {
	private String name;
	private boolean onStock;

	
	public Product(String name, boolean onStock) {
		setName(name);	
		setOnStock(onStock);
	}
	public Product(){
		setName("Coca-Cola");
		setOnStock(true);	
	}	
	//-----get + set--------------
	public String getName() {
	return name;
	}
	public boolean onStock() {
		return onStock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOnStock(boolean onStock) {
		this.onStock = onStock;
	}
	

}
