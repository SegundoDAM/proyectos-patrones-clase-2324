package ejercicio04DataSource;

public class CompressDecorator extends DataSourceDecorator {
	public CompressDecorator(DataSource inputData) {
		super(inputData);
	}

	@Override
	public void writeData(String data) {
		inputData.writeData(compress(data));
	}

	@Override
	public void readData() {
		// TODO Auto-generated method stub

	}

	private String compress(String data) {
		return data + " comprimido";
	}

}
