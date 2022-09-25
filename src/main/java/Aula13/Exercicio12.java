package Aula13;

import javax.swing.*;

public class Exercicio12 {

    public static void main(String[] args) {

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        double pesoIdeal = (72.7 * altura) - 58;

        JOptionPane.showMessageDialog(null,"Peso ideal: "+ pesoIdeal);
    }
}
