
public class Programa {
	public static void main(String[] args) {
		Vendedor v = new Vendedor();
		v.setDataEntrada("30/02/2019");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Eduardo");
		v.setRg("11");
		v.setSalario(1300.0);
		//f1.calculaGanhoAnual();
		
		System.out.println(v.bonifica());
		System.out.println(v.toString());
		
		Gerente g1 = new Gerente();
		g1.setDepartamento("TI");
		g1.setDataEntrada("28/02/2019");
		g1.setEstaNaEmpresa(true);
		g1.setNome("Eric");
		g1.setSalario(3500.0);
		g1.setRg("5");
		g1.setLogin("eric");
		g1.setSenha("123");
		System.out.println(g1.calculaGanhoAnual());
		g1.autentica("eric","1223");
		
		ControleDeBonificacao controle = new ControleDeBonificacao();
		controle.calculaTotalBonus(v.bonifica());
		controle.calculaTotalBonus(g1.bonifica());
		
		System.out.println("Total de bonus: " + controle.getTotalBonus());
		
		System.out.println(g1.bonifica());
		System.out.println(g1.toString());
		
		
	}
}
