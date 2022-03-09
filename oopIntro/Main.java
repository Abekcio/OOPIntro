package oopIntro;

public class Main {

	public static void main(String[] args) {
	
		Product product1 =new Product(); //referans oluþturma, instance
		product1.setId(1);
		product1.setName("lenovo v15");
		product1.setDetail("16 gb ram");
		product1.setDiscount(10);
		product1.setUnitPrice(16000);
		
		System.out.println(product1.getUnitPriceAfterDiscount());

		
		Product product2 =new Product(2, "Lenovo V15" ,16000, "32 Gb RAM",10);
		
				
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("içecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		System.out.println(category1.getName());
		
		ProductManager productManager= new ProductManager();
		productManager.addToCart(product1);
		
		

	}

}
