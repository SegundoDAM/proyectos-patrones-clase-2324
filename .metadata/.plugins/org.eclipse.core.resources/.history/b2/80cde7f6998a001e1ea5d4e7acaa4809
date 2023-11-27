package intentodeprecated01;

import java.util.Observable;
import java.util.Observer;

//Observer necesita saber cuando hay cmambios
public class Consumer implements Observer{
	Object mio;

	@Override
	public void update(Observable o, Object arg) {
		mio=arg;
		System.out.println("nuevo valor "+mio);
	}


}
