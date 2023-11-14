package ejercicio04DataSource;

public abstract class DataSourceDecorator implements DataSource {
	protected DataSource inputData;
	
	public DataSourceDecorator(DataSource inputData) {
		super();
		this.inputData = inputData;
	}

	public abstract String writeData(String data);

	public abstract String readData(String data);

}
