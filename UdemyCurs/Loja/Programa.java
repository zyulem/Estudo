public class Programa {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setEndereco("Rua Bahia");
		p1.setNome("José");
		
		Cliente c1 = new Cliente();
		c1.setCpf("666.666.666-66");
		c1.setEndereco("Rua Pernambuco");
		c1.setNome("Antunes");
		
		Fornecedor f1 = new Fornecedor();
		f1.setCnpj("66.666.666/6666-66");
		f1.setEndereco("Rua Paraná");
		f1.setNome("Adalberto");
		
		System.out.println(p1.getNome());
		System.out.println(p1.getEndereco());
		System.out.println("--------------------");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getEndereco());
		System.out.println(c1.getCpf());
		System.out.println("--------------------");
		
		System.out.println(f1.getNome());
		System.out.println(f1.getEndereco());
		System.out.println(f1.getCnpj());
		System.out.println("--------------------");
	}
}
