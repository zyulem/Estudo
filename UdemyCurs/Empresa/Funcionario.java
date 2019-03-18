
public abstract class Funcionario {
	public String nome;
	public String departamento;
	public double salario;
	public String dataEntrada;
	public String rg;
	public boolean estaNaEmpresa;
			
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public double bonifica() {
		return this.salario * 0.10;
	}
	
	public void demite() {
		this.estaNaEmpresa = false;
	}
	
	public double calculaGanhoAnual() {
			return salario * 12;			
	}
	
	public String toString() {
		return "Funcionario [nome=" + nome + ", departamento=" + departamento + ", salario=" + salario
				+ ", dataEntrada=" + dataEntrada + ", rg=" + rg + ", estaNaEmpresa=" + estaNaEmpresa + "]";
	}	
	
}
