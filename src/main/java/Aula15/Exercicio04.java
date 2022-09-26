package Aula15;

import javax.swing.*;

public class Exercicio04 {

    public static void main(String[] args) {

        String letra = JOptionPane.showInputDialog("Digite a letra: ");

        if (letra.length() > 1){
            JOptionPane.showMessageDialog(null,"Não é uma letra válida");
        } else if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            JOptionPane.showMessageDialog(null,"Vogal");
        } else {
            JOptionPane.showMessageDialog(null,"Consoante");
        }


    }
}
