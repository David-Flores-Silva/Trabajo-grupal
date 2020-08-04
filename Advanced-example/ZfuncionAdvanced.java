package ejemplo;

public class ZfuncionAdvanced {

	public static void main(String[] args) {
			
		Acampo LaptopCnew = new Ventilador (new Soporte(new Laptop()));
		Mostrar(LaptopCnew);
	}
	
	static void Mostrar(Acampo componente) {
		System.out.println(componente.name() );
		System.out.println(componente.price());
		System.out.println("----------");
	}

	
}
