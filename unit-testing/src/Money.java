public class Money {

	private int fAmount;
	private String fCurrency;

	public Money(int amount, String currency) {
		fAmount = amount;
		fCurrency = currency;
	}

	public int getAmount() {
		return fAmount;
	}

	public String getCurrency() {
		return fCurrency;
	}

	public Money add(Money anotherMoney) {
		return new Money(this.getAmount() + anotherMoney.getAmount(), this.getCurrency());
	}

	// Override the equals
	@Override
	public boolean equals(Object anotherObj) {
		if (!(anotherObj instanceof Money)) {
			return false;
		}

		Money anotherMoney = (Money) anotherObj;

		return anotherMoney.fAmount == fAmount && anotherMoney.fCurrency.equals(fCurrency);

	}

}
