package projetovideo;
public class ProjetoVideo {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Usuario g[] = new Usuario[2];
        g[0] = new Usuario("Teste",22,'F',"Teste123");
        g[1] = new Usuario("Teste2",23,'M',"Teste321");
        
        
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        
    }
    
}
