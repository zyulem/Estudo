package heranca;
public abstract class Pessoa { //generalização de Bolsista
    protected String nome;
    private int idade;
    private char sexo;
    
    public final void fazerAniv(){
        this.idade++;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setSexo(char s){
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
