package Aula13;

//Faça um Programa que peça 4 notas bimestrais e mostre a média

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
            double nota[] = new double[4];
            double somaNota = 0;
            double media;
            Scanner teclado = new Scanner(System.in);


            for (int i=0; i<4; i++){
                System.out.println("Informe a nota "+(i+1)+":");
                nota[i] = teclado.nextDouble();
                somaNota += nota[i];
            }

            media = somaNota/ nota.length;

            System.out.println("Media: "+ media);
    }

}
