
public class MainClasse {

	public static void main(String[] args) throws Exception {
		Produto p = new Produto(1, "Computador", 1000.0);
		Cliente c = new Cliente(1, "Gabriel", "987.654.321-00", "gabriel@gabriel.com");
		ClassExplorer.exploreMetadata(c);

	}

}
