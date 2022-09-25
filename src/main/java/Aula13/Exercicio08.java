package Aula13;

import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor ganho por hora: "));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas: "));

        double totalSalario = valorHora * horasTrabalhadas;

        JOptionPane.showMessageDialog(null,"Total salário: "+ totalSalario);
    }
}
