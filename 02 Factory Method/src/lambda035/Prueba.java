package lambda035;

public class Prueba {
public static void main(String[] args) {
	Product product=new ProductManager().getProduct(Types.A);
	System.out.println(product.quienSoy());
	product=new ProductManager().getProduct(Types.B);
	System.out.println(product.quienSoy());

}
}
