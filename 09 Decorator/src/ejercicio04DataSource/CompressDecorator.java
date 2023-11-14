package ejercicio04DataSource;

public class CompressDecorator extends DataSourceDecorator {
	
	public CompressDecorator(DataSource inputData) {
		super(inputData);
	}

	@Override
	public String writeData(String data) {
		String compress = compress(data);
		return inputData.writeData(compress);
	}

	
	private String compress(String data) {
		return data + "comprimido";
	}

	@Override
	public String readData(String data) {
		// TODO Auto-generated method stub
		return null;
	}

}
