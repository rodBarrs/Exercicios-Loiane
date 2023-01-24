package Aula15;

import javax.swing.*;

public class Exercicio15 {
    public static void main(String[] args) {

        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Lado A: "));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Lado B: "));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Lado c: "));

        boolean eTriangulo = (lado1 + lado2 > lado3) || (lado1 + lado3 > lado2) || (lado2 + lado3 > lado1);
        if (eTriangulo){
            if ((lado1 == lado2) && (lado2 == lado3)){
                JOptionPane.showMessageDialog(null,"Triangulo Equilátero");
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                JOptionPane.showMessageDialog(null,"Triangulo Isósceles");
            } else {
                JOptionPane.showMessageDialog(null,"Triangulo Esaleno");
            }git
        } else {
            JOptionPane.showMessageDialog(null,"Não é Triangulo");
        }
    }
}
