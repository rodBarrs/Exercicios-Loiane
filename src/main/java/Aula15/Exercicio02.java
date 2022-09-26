package Aula15;

import javax.swing.*;

public class Exercicio02 {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));

        if (numero > 0){
            JOptionPane.showMessageDialog(null, "Número positivo");
        } else if (numero < 0){
            JOptionPane.showMessageDialog(null, "Numero negativo");
        } else {
            JOptionPane.showMessageDialog(null, "Zero!");
        }

    }
}
