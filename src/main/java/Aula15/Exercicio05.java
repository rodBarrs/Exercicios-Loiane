package Aula15;

import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
        double media = (nota1 + nota2)/2;

        if (media == 10){
            JOptionPane.showMessageDialog(null,"Aprovado com Distinção");
        } else if (media >= 7) {
            JOptionPane.showMessageDialog(null,"Aprovado");
        } else {
            JOptionPane.showMessageDialog(null,"Reprovado");
        }

    }
}
