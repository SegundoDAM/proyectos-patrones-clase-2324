package banco02.ConcreteYoung;

import banco02.AbstractProductAccount;

public class ConcreteProdutAccountYoung extends AbstractProductAccount {

	public ConcreteProdutAccountYoung() {
		super(1f);
	}

	@Override
	public void show() {
		System.out.println("la comsion del joven es "+comission);
		
	}

	
	
}
