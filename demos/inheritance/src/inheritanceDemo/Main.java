package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.id = 1;
		customer.age = 36;
		customer.email = "engindemirog@gmail.com";
		customer.firstName = "Engin";
		customer.lastName = "Demiro�";
		
		employee.id = 2;
		employee.age = 30;
		employee.firstName = "Bulut";
		employee.lastName = "�zeren";
		employee.salary = 10000;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.add();
		customerManager.add();
	}

}
