package Aula13;

//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [Número].

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = teclado.nextInt();

        System.out.println("O número informado foi : "+ numero);
    }

}
