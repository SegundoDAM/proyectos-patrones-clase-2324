package banco02;

public interface AbstractFactory {

	public AbstractProductAccount createAccount();
	public AbstractProductCreditCard createCreditCard();
	public AbstractProductDebitCard createDebitCard();
}
