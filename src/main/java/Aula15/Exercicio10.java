package Aula15;

import javax.swing.*;

public class Exercicio10 {
    public static void main(String[] args) {

        String turno = JOptionPane.showInputDialog("Informe o turno: ");
        if (turno.equalsIgnoreCase("M")){
            JOptionPane.showMessageDialog(null,"Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            JOptionPane.showMessageDialog(null, "Boa Tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            JOptionPane.showMessageDialog(null, "Boa Noite!");
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}
