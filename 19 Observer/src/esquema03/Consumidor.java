package esquema03;

public class Consumidor implements Subscriber<StringBuilder>{

	Productor productor;
	String name;
	int counter=0;
	int maximum;

	public Consumidor(Productor productor, String name, int maximum) {
		super();
		this.productor = productor;
		this.name = name;
		if(productor.subscribe(this)) {
			this.maximum=maximum;
			System.out.println(name+" suscrito a la publicacion");
		}else {
			System.out.println(name +" fallo en la suscripcion");
		}
	}


	@Override
	public void update(StringBuilder context) {
		if(counter++<maximum) {
			System.out.println("el Consumidor "+name+" pilla el numero "+counter);
		}else {
			if(productor.unsubscribe(this)) {
				System.out.println(name+" lo deja ya");
			}else {
				System.out.println(name+" error al dejar");
			}
		}
	}

}
