package Aula13;

import javax.swing.*;

public class Exercicio13 {
    public static void main(String[] args) {

        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor ganho por hora: "));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabalhadas: "));

        double salarioBruto = valorHora * horasTrabalhadas;
        double impostoDeRenda = salarioBruto * 0.11;
        double INSS = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double totalDescontos = impostoDeRenda + INSS + sindicato;
        double salarioLiquido = salarioBruto - impostoDeRenda - INSS - sindicato;

        JOptionPane.showMessageDialog(null,"Salario Bruto: "+ salarioBruto);
        JOptionPane.showMessageDialog(null,"Imposto de Renda: "+ impostoDeRenda);
        JOptionPane.showMessageDialog(null,"INSS: "+ INSS);
        JOptionPane.showMessageDialog(null,"Sindicato: "+ sindicato);
        JOptionPane.showMessageDialog(null,"Total de descontos: "+ totalDescontos);
        JOptionPane.showMessageDialog(null,"Salario Liquido: "+ salarioLiquido);

    }
}
