package src;

public class  Money {

	protected int amount;
	protected String currency;

	public Money() {
		super();
	}
	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public String toString() {
		return amount + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Money))
			return false;
		Money other = (Money) obj;
		if (amount != other.amount ||
				this.getClass()!= other.getClass() )
			return false;
		return true;
	}

	public Money times(int multiplier) {
		return Money.Dollar(amount * multiplier);
	}

	public static Money Dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Franc Franc(int amount) {
		return new Franc(amount);
	}


}