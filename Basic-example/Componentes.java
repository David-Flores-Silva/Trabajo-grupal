package ejemplo;

public abstract class Componentes implements Campo {

	Campo componente;
	String namecomp;
	double pricecomp;
	
	public Componentes(Campo componente) {
		this.componente = componente;
	}
	
	public String name() {
		return componente.name() + "  " + namecomp +"=" + pricecomp;
	}

	public double price() {
		return componente.price()+pricecomp;
	}

}
