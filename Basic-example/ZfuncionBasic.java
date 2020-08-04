package ejemplo;

public class ZfuncionBasic {

	public static void main(String[] args) {
		Campo Laptopnew = new Lapto();
		Mostrar(Laptopnew);
	}	
	
	static void Mostrar(Campo componente) {
		System.out.println(componente.name() );
		System.out.println(componente.price());
		System.out.println("----------");
	}

	
}
