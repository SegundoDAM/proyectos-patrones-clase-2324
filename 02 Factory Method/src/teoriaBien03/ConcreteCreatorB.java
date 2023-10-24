package teoriaBien03;

public class ConcreteCreatorB extends CreatorAbstract {

	@Override
	public ProductAbstract factoryMethod() {
		return new ConcreteProductB();
	}

}
