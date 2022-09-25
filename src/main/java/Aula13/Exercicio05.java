package Aula13;

import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {
        double metro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor em metro: "));
        double centimetro = metro * 100;
        JOptionPane.showMessageDialog(null,metro+" metro(s) equivalem a "+ centimetro+" centimetro(s)");
    }
}
