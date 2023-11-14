package ejercicio04DataSource;

public class FileDataSource implements DataSource {
	String filename;

	@Override
	public void writeData(String data) {
		System.out.println(data);
	}

	@Override
	public void readData() {
		// TODO Auto-generated method stub

	}

}
