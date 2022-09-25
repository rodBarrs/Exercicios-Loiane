package Aula13;

import javax.swing.*;

public class Exercicio06 {

    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog("Valor do raio: "));
        double area = Math.PI * Math.pow(raio,2);

        JOptionPane.showMessageDialog(null, "Area do circulo:"+ area);

    }
}
