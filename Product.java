
public class Product {
	private String name;
<<<<<<< HEAD
	private boolean onStock;

	
	public Product(String name, boolean onStock) {
		setName(name);	
		setOnStock(onStock);
	}
	public Product(){
		setName("Coca-Cola");
		setOnStock(true);	
=======
	private float price;

	
	public Product(String name, float price) {
		setName(name);	
		setPrice (price);
	}
	public Product(){
		setName("Coca-Cola");
		setPrice(10);	
>>>>>>> origin/master
	}	
	public String getName() {
	return name;
	}
	public boolean onStock() {
		return onStock;
	}
	public void setName(String name) {
		this.name = name;
	}
<<<<<<< HEAD
	public void setOnStock(boolean onStock) {
		this.onStock = onStock;
=======

	public float getPrice(){
		return price;
	}

	public void setPrice(float price){
		this.price=price;
>>>>>>> origin/master
	}
	

}
