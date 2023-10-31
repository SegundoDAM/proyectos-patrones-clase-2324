package banco02;

import banco02.ConcreteYoung.ConcreteProdutAccountYoung;

public class ConcreteFactoryYoung implements AbstractFactory{

	@Override
	public AbstractProductAccount createAccount() {
		return new ConcreteProdutAccountYoung();
	}

	@Override
	public AbstractProductCreditCard createCreditCard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractProductDebitCard createDebitCard() {
		// TODO Auto-generated method stub
		return null;
	}

}
