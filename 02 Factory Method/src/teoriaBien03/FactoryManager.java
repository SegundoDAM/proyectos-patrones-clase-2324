package teoriaBien03;

public class FactoryManager {
	
	public ProductAbstract getProduct(CreatorAbstract creatorAbstract) {
		return creatorAbstract.factoryMethod();
	}
}
