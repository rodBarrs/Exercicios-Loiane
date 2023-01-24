package Aula15;

import javax.swing.*;

public class Exercicio13 {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        switch (numero) {
            case 1: JOptionPane.showMessageDialog(null,"1-Domingo");break;
            case 2: JOptionPane.showMessageDialog(null,"2-Segunda");break;
            case 3: JOptionPane.showMessageDialog(null,"3-terça");break;
            case 4: JOptionPane.showMessageDialog(null,"4-Quarta");break;
            case 5: JOptionPane.showMessageDialog(null,"5-Quinta");break;
            case 6: JOptionPane.showMessageDialog(null,"6-Sexta");break;
            case 7: JOptionPane.showMessageDialog(null,"7-Sábado");break;
            default:JOptionPane.showMessageDialog(null,"Valor inválido");
        }
    }
}
