package Aula13;

import javax.swing.*;

public class Exercicio07 {

    public static void main(String[] args) {

    double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado do quadrado: "));
    double area = Math.pow(lado,2);

        JOptionPane.showMessageDialog(null,"Area: " + area);
        JOptionPane.showMessageDialog(null,"Dobro da Area: " + area * 2);


    }
}
