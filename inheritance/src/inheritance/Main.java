package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78965";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "55555";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(engin);
		customerManager.add(hepsiBurada);
		customerManager.add(sendikaCustomer);
		
		customerManager.addMultiple(new Customer[] {engin, hepsiBurada, sendikaCustomer});
	}

}
