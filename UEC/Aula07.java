package aula07;
public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador ("Pretty Boy", "França", 31, 1.75F, 68.9F, 11, 3, 1);
        l[1] = new Lutador ("Putscript", "Brasil", 29, 1.68F, 57.8F, 14, 2, 3);
        l[2] = new Lutador ("Snapshadow","USA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador ("Dead Code","Austrália",28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador ("UFOCobol","Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador ("Nerdart", "USA", 30, 1.81f, 105.7f, 12, 2, 4);        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[5], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
    }    
}
