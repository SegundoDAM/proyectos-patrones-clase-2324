package ejercicio04DataSource;

public class EncryptionDecorator extends DataSourceDecorator {
	

	public EncryptionDecorator(DataSource inputData) {
		super(inputData);
	}

	@Override
	public void writeData(String data) {
		this.inputData.writeData(encript(data));
	}

	@Override
	public void readData() {
		// TODO Auto-generated method stub

	}

	public String encript(String data) {
		return data+"encriptado";
	}
}
