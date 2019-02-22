package idade;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Insira a idade: ");        
        int idade = keyboard.nextInt();
        if (idade>0 && idade<18) {
            System.out.println("Menor de idade!");            
        } else {
            System.out.println("Maior de idade");
        }
        if (idade<12) {
            System.out.println("Criança");            
        } else if (idade>12 && idade<=17) {
            System.out.println("Adolescente");
        } else if (idade>17 && idade<65) {
            System.out.println("Adulto");
        } else if (idade>65) {
            System.out.println("Idoso");
        }
                
        //criança <12 , adolescente 12 >=12 e <=17, adulto >17 e <65 | idoso =>65       
        
    }
    
}
