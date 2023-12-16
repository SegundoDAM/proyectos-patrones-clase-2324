package forma;

public class nose {
	public Adapter<String, Float> mapStringToFloat = new Adapter<String, Float>() {

		@Override
		public Float map(String t) {
			return Float.valueOf(t);
		}
	};
}
