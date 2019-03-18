public class Programa {

	public static void main(String[] args) {
		System.out.println("Copa Paulista:");
		
		Tecnico t1 = new Tecnico();
		t1.setEspecialidade("Contra-ataque");
		t1.setName("Rubens Barrichelo");
		t1.setDataNascimento("10/02/1992");
		
		Tecnico t2 = new Tecnico();
		t2.setEspecialidade("Ataque");
		t2.setName("Alfredo");
		t2.setDataNascimento("11/04/2019");		
		
		Jogador j0 = new Jogador();
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
		Jogador j5 = new Jogador();
		Jogador j6 = new Jogador();
		Jogador j7 = new Jogador();
		Jogador j8 = new Jogador();
		Jogador j9 = new Jogador();
		Jogador j10 = new Jogador();
		Jogador j11 = new Jogador();
		Jogador j12 = new Jogador();
		Jogador j13 = new Jogador();
		Jogador j14 = new Jogador();
		Jogador j15 = new Jogador();
		Jogador j16 = new Jogador();
		Jogador j17 = new Jogador();
		Jogador j18 = new Jogador();
		Jogador j19 = new Jogador();
		Jogador j20 = new Jogador();
		Jogador j21 = new Jogador();
		
		j0.setName("Edson");
		j1.setName("Valter");
		j2.setName("Pedro");
		j3.setName("Zeca");
		j4.setName("Ronaldo");
		j5.setName("Adriano");
		j6.setName("Ronaldinho");
		j7.setName("Messi");
		j8.setName("Neymar");
		j9.setName("Pelé");
		j10.setName("Zico");
		j11.setName("Garrincha");
		j12.setName("Pato");
		j13.setName("Cafu");
		j14.setName("Cristiano Ronaldo");
		j15.setName("Roberto Carlos");
		j16.setName("Tafarel");
		j17.setName("Geronimo");
		j18.setName("Adalberto");
		j19.setName("Zé Pequeno");
		j20.setName("Kaka");
		j21.setName("Desconhecido");
		
		Jogador[] jg1 = new Jogador[10];			
		
		Equipe e1 = new Equipe();
		e1.setNome("Time A");
		e1.setTecnico(t1);
		e1.setCidade("Taquarão");
		e1.setJogadores(jg1);
		e1.adicionaJogador(j0);
		e1.adicionaJogador(j1);
		e1.adicionaJogador(j2);
		e1.adicionaJogador(j3);
		e1.adicionaJogador(j4);
		e1.adicionaJogador(j5);
		e1.adicionaJogador(j6);
		e1.adicionaJogador(j7);
		e1.adicionaJogador(j8);
		e1.adicionaJogador(j9);
		e1.adicionaJogador(j10);
		
		Jogador[] jg2 = new Jogador[11];
		
		Equipe e2 = new Equipe();
		e2.setNome("Time B");
		e2.setTecnico(t2);
		e2.setCidade("Blumenau");	
		e2.setJogadores(jg2);
		e2.adicionaJogador(j11);
		e2.adicionaJogador(j12);
		e2.adicionaJogador(j13);
		e2.adicionaJogador(j14);
		e2.adicionaJogador(j15);
		e2.adicionaJogador(j16);
		e2.adicionaJogador(j17);
		e2.adicionaJogador(j18);
		e2.adicionaJogador(j19);
		e2.adicionaJogador(j20);
		e2.adicionaJogador(j21);
						
		Partida p1 = new Partida();		
		p1.setEquipe(e1);
		p1.setEquipe(e2);
		p1.setData("06/01/2016");
		p1.setEstadio("Taquarão");
		
		System.out.println(p1.getEquipe(e1).getNome() +" x "+ p1.getEquipe(e2).getNome());
		System.out.println("Estádio: " + p1.getEstadio());
		System.out.println("Data: " + p1.getData());
		
		System.out.println("---------------------------------");
		
		System.out.println("Informações do time de casa:");
		
		System.out.println(e1.getNome());
		System.out.println(e1.getTecnico().getName());
		System.out.println(e1.getTecnico().getEspecialidade());
		System.out.println(j1.getName());
		System.out.println(e1.getTecnico().getDataNascimento());
		
		System.out.println("------Escalação do time da casa:------");
		for (Jogador j : e1.getJogadores()) {
			System.out.println(j.name + " - Posição: " + j.getPosicao());
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("Informações do time visitante");
		
		System.out.println(e2.getNome());
		System.out.println(e2.getTecnico().getName());
		System.out.println(e2.getTecnico().getEspecialidade());
		System.out.println(j5.getName());
		System.out.println(e2.getTecnico().getDataNascimento());
		
		System.out.println("------Escalação do time visitante:------");
		for (Jogador j : e2.getJogadores()) {
			System.out.println(j.name + " - Posição: " + j.getPosicao());
		}
	}

}
