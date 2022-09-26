package Aula15;

import javax.swing.*;

public class Exercicio01 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

        if (numero1 > numero2){
            JOptionPane.showMessageDialog(null,numero1);
        } else if (numero2 > numero1){
            JOptionPane.showMessageDialog(null,numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Você digitou o mesmo Número");
        }

    }
}
