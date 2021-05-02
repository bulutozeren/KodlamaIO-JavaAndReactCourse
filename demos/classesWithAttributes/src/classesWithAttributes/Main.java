package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		System.out.println(product.getName());
		
		Product product2 = new Product(2,"Laptop","Dell Laptop",4000,4);
		System.out.println(product2.getName());
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getStockCode());
	}

}
