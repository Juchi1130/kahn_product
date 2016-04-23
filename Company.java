
import java.util.*;

public class Company {
	private LinkedList products;
	private String name;
	
	public Company() {
		setName("IBM");
		products = new LinkedList(1000);

	public Company(String name) {
		setName(name);
		products = new LinkedList(1000);
	}
}