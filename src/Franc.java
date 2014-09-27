package src;

public class Franc extends Money {
	public Franc(int amount) {
		this.amount = amount;
	}
	public Money times(int multiplier) {
		return Money.Franc(amount * multiplier);
	}
	


}
