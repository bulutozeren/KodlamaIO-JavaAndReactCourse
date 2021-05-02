package overriding;

public class HomeCreditManager extends BaseCreditManager {
	public double calculator(double price) {
		return price * 1.25;
	}
}
