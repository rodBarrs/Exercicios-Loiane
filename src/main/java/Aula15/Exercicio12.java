package Aula15;

import javax.swing.*;

public class Exercicio12 {

    public static void main(String[] args) {


        double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhadas no mes: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor hora do funcionario: "));
        double salarioBruto = horasTrabalhadas * valorHora;
        double impostoDeRenda;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDescontos;
        double salarioLiquido;
        if (salarioBruto <= 900){
            impostoDeRenda = 0;
        } else if (salarioBruto <= 1500){
            impostoDeRenda = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500){
            impostoDeRenda = salarioBruto * 0.1;
        } else {
            impostoDeRenda = salarioBruto * 0.2;
        }

        totalDescontos = impostoDeRenda + inss;
        salarioLiquido = salarioBruto - totalDescontos;
        JOptionPane.showMessageDialog(null,"Salário Bruto: "+ salarioBruto +"\n" +
                "Imposto de Renda: "+ impostoDeRenda+"\n" +
                "INSS: "+ inss+"\n" +
                "FGTS: "+ fgts+"\n"+
                "Total de descontos: "+totalDescontos+"\n" +
                "Salário Liquido: "+salarioLiquido);
    }
}
