package aula03;
class Filme{
    int codigo;
    String nome;
    double valor;
}

class Programa {
    public static void main(String[] args) {
    Filme filme = new Filme();
    filme.codigo = 123;
    filme.nome = "A Era do Gelo";
    filme.valor = 2.50;
    
    Filme filme2 = new Filme();
    filme2.codigo = 321;
    filme2.nome = "A Era do Gelo 2";
    filme2.valor = 3.5;
    
    System.out.println(filme);
    System.out.println(filme.codigo);
    System.out.println(filme.nome);
    System.out.println(filme.valor);
    
    System.out.println(filme2);
    System.out.println(filme2.codigo);
    System.out.println(filme2.nome);
    System.out.println(filme2.valor);
    }
}