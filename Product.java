
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
	private int id;

	
	public Product(String name, float price, int id) {
		setName(name);	
		setPrice (price);
		setId(id);
	}
	public Product(int id){
		setName("Coca-Cola");
<<<<<<< HEAD
		setPrice(10);
=======
		setPrice(10);	
>>>>>>> origin/master
>>>>>>> origin/master
	}	

	public String getName() {
	return name;
	}
<<<<<<< HEAD

=======
	public boolean onStock() {
		return onStock;
	}
>>>>>>> origin/master
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
<<<<<<< HEAD
		this.price = price;
	}

	public int getId(){
		return id;
=======
		this.price=price;
>>>>>>> origin/master
>>>>>>> origin/master
	}
	
	public void setID(int id){
		this.id = id;
	}

}
