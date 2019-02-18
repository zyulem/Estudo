class Conta {
	int numeroConta;
	Cliente titular;
	double saldo;

	boolean sacar(double valor){
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
											
	}

	void depositar(double valor){
		saldo += valor; 
	}

	boolean transferir(Conta contaDestino, double valor){
		if (this.saldo>= valor) {
			this.saldo -= valor;
			contaDestino.saldo += valor;			
			return true;
		} else {
			return 	false;
		}
	}
	
}

class Funcionario {
	public String nome;
	public String departamento;
	public double salario;
	public String dataEntrada;
	public String rg;
	public boolean estaNaEmpresa;
	
	public void bonifica(double v) {
		this.salario += v;
	}
	
	public void demite() {
		this.estaNaEmpresa = false;
	}
	
	public double calculaGanhoAnual() {
			return salario * 12;			
	}
}

class Cliente {
	String nome;
	String cpf;		
}

class Programa {
	public static void main(String[] args) {
		Cliente clienteEdu = new Cliente();
		clienteEdu.nome = "Eduardo";
		clienteEdu.cpf = "256.485.589-48";
		
		Conta contaEdu = new Conta();
		contaEdu.titular = clienteEdu;
		contaEdu.numeroConta = 123;		
		contaEdu.saldo = 2000.0;
		
		System.out.println (contaEdu);
		System.out.println (contaEdu.titular);
		System.out.println (contaEdu.titular.nome);
		System.out.println (contaEdu.titular.cpf);
		System.out.println (contaEdu.numeroConta);
		System.out.println (contaEdu.saldo);
		System.out.println (clienteEdu);
		
	}
}