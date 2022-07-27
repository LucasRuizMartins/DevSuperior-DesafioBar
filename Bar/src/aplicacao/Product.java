package aplicacao;

public class Product {

	private String name;
	private Double price;
	int quantity;

	public Product() {

	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double ticketValue(Character sex) {

		if (Character.toUpperCase(sex) == 'M') {
			return 10.00;
		}
		if (Character.toUpperCase(sex) == 'F') {
			return 8.00;
		}
		return 0;

	}

}
