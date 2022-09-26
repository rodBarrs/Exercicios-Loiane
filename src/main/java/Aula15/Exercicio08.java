package Aula15;

import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {

        double preco1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco 1: "));
        double preco2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2: "));
        double preco3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 3: "));

        if ((preco1 <= preco2) && (preco1 <= preco3)) {
            JOptionPane.showMessageDialog(null,"Compre o produto 1 ");
        } else if ((preco2 <= preco3) && (preco2 <= preco1)){
            JOptionPane.showMessageDialog(null,"Compre o produto 2 ");
        } else {
            JOptionPane.showMessageDialog(null,"Compre o produto 3 ");
        }


    }
}
