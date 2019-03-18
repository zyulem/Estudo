
public class Gerente extends Funcionario{
	private String login;
	private String senha;
				
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void autentica(String login, String senha) {
		if (this.login == login && this.senha == senha) {
			System.out.println("Acesso permitido!");
		} else {
			System.out.println("Acesso negado!");
		}
	}
	
	@Override
	public double bonifica() {
		return this.salario * 0.15;
	}

	@Override
	public String toString() {
		return "Gerente [login=" + login + ", senha=" + senha +"\n"
				+ super.toString();
	}	
	
}
