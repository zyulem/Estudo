package urna;

import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {        
        Candidato vencedor;
        int numero;
        Scanner keyboard = new Scanner(System.in);
        Candidato adilson = new Candidato ("Adilson","PSOL",24,0);
        Candidato lucas = new Candidato ("Lucas","PSL",66,0);
        Candidato kluves = new Candidato ("Kluves","PT",13,0);        
       
        do {
        System.out.println("Candidato: " + adilson.nome + " Partido: " + adilson.chapa + " Número: " + adilson.numero);
        System.out.println("Candidato: " + lucas.nome + " Partido: " + lucas.chapa + " Número: " + lucas.numero);
        System.out.println("Candidato: " + kluves.nome + " Partido: " + kluves.chapa + " Número: " + kluves.numero);
        System.out.println("Em branco: Número: 1");
        System.out.println("Anular: Número: 2");
        System.out.println("Ver resultados: 99");
        System.out.println("");
        System.out.println("Sair: Número: 0");
        
        System.out.print("Insira o número de seu candidato:");
        numero = keyboard.nextInt();        
        
        switch (numero) {
            case 24:
                adilson.receberVotos();
                break;
            case 66:
                lucas.receberVotos();
                break;
            case 13:
                kluves.receberVotos();
                break;        
            case 0:
                break;
            case 1:
                if (adilson.votos > lucas.votos && adilson.votos > kluves.votos) {
                    adilson.receberVotos();
                } else if (lucas.votos > adilson.votos && lucas.votos > kluves.votos) {
                    lucas.receberVotos();
                } else if (kluves.votos > adilson.votos && kluves.votos > lucas.votos) {
                    kluves.receberVotos();
                }
                break;
            case 99:
                if (adilson.votos > lucas.votos && adilson.votos > kluves.votos) {
                    System.out.println("O vencedor é: " + adilson.nome + " com " + adilson.votos + " votos!");
                } else if (lucas.votos > adilson.votos && lucas.votos > kluves.votos) {
                    System.out.println("O vencedor é: " + lucas.nome + " com " + lucas.votos + " votos!");
                } else if (kluves.votos > adilson.votos && kluves.votos > lucas.votos) {
                    System.out.println("O vencedor é: " + kluves.nome + " com " + kluves.votos + " votos!");
                }
                break;
        }
        } while (numero != 0);
        /*if (adilson.votos > lucas.votos && adilson.votos > kluves.votos) {
                    System.out.println("O vencedor é: " + adilson.nome + " com " + adilson.votos + " votos!");
                } else if (lucas.votos > adilson.votos && lucas.votos > kluves.votos) {
                    System.out.println("O vencedor é: " + lucas.nome + " com " + lucas.votos + " votos!");
                } else if (kluves.votos > adilson.votos && kluves.votos > lucas.votos) {
                    System.out.println("O vencedor é: " + kluves.nome + " com " + kluves.votos + " votos!");
                }*/
    
    }
}

        /*switch (numero) {
            case 99:
            System.out.println("O vencedor é: " + vencedor + " com " + vencedor.votos + " votos!");
            break;
        }  */     
    
