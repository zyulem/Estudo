package aula04;
public class Caneta {
    String modelo;
    private float ponta;
    private String cor;
    public boolean tampada;    
        
    public Caneta(String modelo, String cor, float p) { //Este eh o metedo construtor
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = p;
        this.tampar();
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
