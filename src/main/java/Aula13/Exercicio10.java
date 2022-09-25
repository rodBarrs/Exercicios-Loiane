package Aula13;

import javax.swing.*;

public class Exercicio10 {

    public static void main(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em Celsius: "));
        double farenheit = 1.8 * celsius + 32;

        JOptionPane.showMessageDialog(null,"Temperatura em Farenheit: "+ farenheit);

    }
}
