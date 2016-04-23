
public class Product {
	private String name;
	private float price;
	private int id;

	
	public Product(String name, float price, int id) {
		setName(name);	
		setPrice (price);
		setId(id);
	}
	public Product(int id){
		setName("Coca-Cola");
		setPrice(10);
	}	

	public String getName() {
	return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice(){
		return price;
	}

	public void setPrice(float price){
		this.price = price;
	}

	public int getId(){
		return id;
	}
	
	public void setID(int id){
		this.id = id;
	}

}
