package polimorfismo;
public class Cachorro extends Lobo {
    public void reagir(String f) {
        if (f.equals("Toma comida") || f.equals("Olá")) {
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int h, int min){
        if (h<12) {
            System.out.println("Abanar");            
        } else if (h>=18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono) {
        if (dono == true){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade <5) {
            if (peso<10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso<10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }           
            
        }
    }
   
    
    /*public void enterrarOsso() {
        System.out.println("Está enterrando o osso");
    }
    
    public void abanarRabo() {
        System.out.println("Abanando o rabo!");
    }*/
    
    @Override
    public void emitirSom(){
        System.out.println("Latindo!");
    }
}
