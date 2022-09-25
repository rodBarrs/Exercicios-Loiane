package Aula13;

import javax.swing.*;

public class Exercicio09 {
    public static void main(String[] args) {
        double farenheit = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de graus Farenheit: "));
        double celsius = (5 * (farenheit-32) / 9);

        JOptionPane.showMessageDialog(null, "Celsius: "+ celsius);
    }
}
