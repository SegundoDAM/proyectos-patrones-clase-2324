package ejercicio04DataSource;

public abstract class DataSourceDecorator implements DataSource {
	protected DataSource inputData;
	
	public DataSourceDecorator(DataSource inputData) {
		super();
		this.inputData = inputData;
	}

	public abstract void writeData(String data);

	public abstract void readData();

}
