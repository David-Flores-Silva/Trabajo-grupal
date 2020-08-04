package ejemplo;

public class FuncionAdvanced {

	public static void main(String[] args) {
			
		Acampo LaptopCnew = new Ventilador (new Soporte(new Lapto()));
		Mostrar(LaptopCnew);
	}
	
	static void Mostrar(Acampo componente) {
		System.out.println(componente.name() );
		System.out.println(componente.price());
		System.out.println("----------");
	}

	
}
