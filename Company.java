
import java.util.ArrayList;

public class Company {
	private ArrayList products;
	private String name;
	
	public Company() {
		setName("IBM");
		products = new ArrayList(1000);

	public Company(String name) {
		setName(name);
		products = new ArrayList(1000);
	}
}