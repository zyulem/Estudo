package projetovideo;
public class Usuario extends Pessoa{
    private String login;
    private int totAssistido;

    public Usuario(String pessoa, int idade, char sexo, String login) {
        super(pessoa, idade, sexo);
        this.login = login;
        this.totAssistido = 0; 
    }       

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
    public void viuMaisUm(){
        this.totAssistido++;
    }

    @Override
    public String toString() {
        return "Usuario{" 
                + super.toString() /*Para chamar o String da superclasse (Pessoa */ + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
