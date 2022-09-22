package Aula13;

//Faça um programa que peça dois números e imprima a soma

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número 1: ");
        int numero1 = teclado.nextInt();

        System.out.println("Informe o número 2: ");
        int numero2 = teclado.nextInt();

        int  soma = numero1 + numero2;

        System.out.println("A soma de "+numero1+" e "+numero2 + " é : "+soma);


    }

}
