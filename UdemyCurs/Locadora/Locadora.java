class Filme {
	int codigo;
	String nome;
	double valor;
	boolean disponivel;
	
	public void retirarFilme () {
		this.disponivel = false;
	}
	
	public void devolverFilme () {
		this.disponivel = true;
	}
}

class Programa {
	public static void main(String[] args) {
		Filme filme = new Filme();			
		filme.codigo = 123;
		filme.nome = "A Era do Gelo";
		filme.valor = 2.50;
		filme.retirarFilme();
		
		if (filme.disponivel == true) {
			System.out.println ("Está disponível!");
		} else {
			System.out.println ("Não está disponivel!");
		}
		
		filme.devolverFilme();
		
		if (filme.disponivel == true) {
			System.out.println ("Está disponível!");
		} else {
			System.out.println ("Não está disponivel!");
		}

		Filme filme2 = filme;
		filme2.codigo = 321;
		filme2.nome = "A Era do Gelo 2";
		filme2.valor = 3.50;		
		
		
		
		System.out.println(filme);
		System.out.println(filme.codigo);
		System.out.println(filme.nome);
		System.out.println(filme.valor);
		
		System.out.println(filme2);
		System.out.println(filme2.codigo);
		System.out.println(filme2.nome);
		System.out.println(filme2.valor);		
	}
}