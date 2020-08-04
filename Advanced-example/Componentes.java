package ejemplo;

public abstract class Componentes implements Acampo {

	Campo componente;
	String namecomp;
	double pricecomp;
	
	public Componentes(Acampo componente) {
		this.componente = componente;
	}
	
	public String name() {
		return componente.name() + "  " + namecomp +"=" + pricecomp;
	}

	public double price() {
		return componente.price()+pricecomp;
	}

}
