package ejemplo;

public class Lapto implements Campo {

	public String name() {
		return "Laptop: " +price();
	}

	public double price() {
		return 400.00;
	}

}
