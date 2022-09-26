package Aula15;

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {
        String letra =JOptionPane.showInputDialog("Digite a letra: ");

        if ( letra.equalsIgnoreCase("M")){
            JOptionPane.showMessageDialog(null,"Sexo Masculino");
        } else if ( letra.equalsIgnoreCase("F")){
            JOptionPane.showMessageDialog(null,"Sexo Feminino");
        } else {
            JOptionPane.showMessageDialog(null,"Sexo inválido");
        }

    }
}
