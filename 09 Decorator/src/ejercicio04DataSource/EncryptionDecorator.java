package ejercicio04DataSource;

public class EncryptionDecorator extends DataSourceDecorator {
	

	public EncryptionDecorator(DataSource inputData) {
		super(inputData);
	}

	@Override
	public String writeData(String data) {
		return this.inputData.writeData(encript(data));
	}

	public String encript(String data) {
		return data+"encriptado";
	}

	@Override
	public String readData(String data) {
		// TODO Auto-generated method stub
		return null;
	}


}
