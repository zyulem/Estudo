package urna;
public class Candidato {
    String nome;
    String chapa;
    int numero;
    int votos;

    public Candidato(String nome, String chapa, int numero, int votos) {
        this.nome = nome;
        this.chapa = chapa;
        this.numero = numero;
        this.votos = votos;
    }      
    
    public void receberVotos () {
        this.votos = votos++;
    }
}
