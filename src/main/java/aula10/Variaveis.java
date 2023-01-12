package aula10;

public class Variaveis {

    public static void main(String[] args) {

        //Convenção java
        int idade;
        String nome = "Rodrigo";
        String nomeDoMeuCachorro = "Totó";
        String ano2014 = "2014";

        // Não é convenção java
        int _idade;
        int $idade;

        String nome_do_meu_cachorro;
        String nomeDoMeucachorro;

        idade = 25;
        System.out.println("Idade = " + idade);

        // má prática
        int a = 3;
        String b = "aa";
    }

}
