package Aula15;

import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2: "));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 3: "));

        if ((numero1 >= numero2) && (numero1 >= numero3)) {
            JOptionPane.showMessageDialog(null,"Numero 1 maior! " + numero1);
        } else if ((numero2 >= numero3) && (numero2 >= numero1)){
            JOptionPane.showMessageDialog(null,"Numero 2 maior! " + numero2);
        } else {
            JOptionPane.showMessageDialog(null,"Numero 3 maior! " + numero3);
        }



    }
}
