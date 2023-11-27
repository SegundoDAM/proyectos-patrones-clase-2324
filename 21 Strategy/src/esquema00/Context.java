package esquema00;

public class Context  {
	public Strategy strategy;
	Data data;
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void doIt() {
//		strategy.doThis(data);
	}

	public Context(Data data) {
		super();
		this.data = data;
	}
}
