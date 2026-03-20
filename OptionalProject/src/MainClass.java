
public class MainClass {
	
	public static void main(String[] args) {
		ProdutoRepo repo = new ProdutoRepo();
		
		Produto p = repo.findById(10).orElseThrow(()-> new RuntimeException("Produto inexistente"));
		IO.println(p);
		
		
	}
}
