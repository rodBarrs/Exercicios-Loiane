package Aula13;

import javax.swing.*;

public class Exercicio11 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Numero 3: "));

        double a = (numero1*2)*(numero2/2);
        double b = (numero1*3) + numero3;
        double c = Math.pow(numero3,3);
        JOptionPane.showMessageDialog(null,"Produto do dobro do primeiro com metade do segundo: "+ a);
        JOptionPane.showMessageDialog(null,"Soma do triplo do peimeiro com o terceiro: "+ b);
        JOptionPane.showMessageDialog(null,"O terceiro elevado ao cubo: "+ c);

    }
}
