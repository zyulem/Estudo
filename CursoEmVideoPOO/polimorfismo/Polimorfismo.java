package polimorfismo;

/*
Polimorfismo de sobreposição acontece quando substituimos um método de uma superclasse na sua subclasse, usando a mesma assinatura.
*/

public class Polimorfismo {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        
        /*Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        c.locomover();
        c.usarBolsa();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
        
        
        /*Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Mamifero mn = new Mamifero();
        Canguru c = new Canguru();
        Cachorro dog = new Cachorro();
        
        mn.setPeso(5.70f);
        mn.setIdade(8);
        mn.setMembros(4);
        mn.locomover();
        mn.alimentar();
        mn.emitirSom();
        
        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();    
        
        dog.setPeso(3.94f);
        dog.setIdade(5);
        dog.setMembros(4);
        dog.locomover();
        dog.alimentar();
        dog.emitirSom();
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();*/
    }
    
}
