package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");
		
		
//		  Product product = new Product();
//		  product.setDescription("Asus Laptop");
//		  product.setId(1);
//		  product.setName("Laptop");
//		  product.setPrice(50000);
//		  product.setStockAmount(10);
//		 
		 
		
		System.out.println(product.getCode());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
