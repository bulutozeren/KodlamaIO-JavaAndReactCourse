package inheritanceDemo2;

public class Main {

	public static void main(String[] args) {
		ConsumerCreditManager consumerCreditManager = new ConsumerCreditManager();
		consumerCreditManager.Calculator();
		
		CreditUI creditUI = new CreditUI();
		creditUI.CreditCalculator(new VehicleCreditManager());
	}

}
