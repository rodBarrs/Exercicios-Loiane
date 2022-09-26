package Aula15;

import javax.swing.*;

public class Exercicio11 {
    public static void main(String[] args) {

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));
        double reajuste = 0;
        double salarioComReajuste = 0;
        double valorDoAumento = 0;
        double valorPercentual = 0;

        if (salario <= 280){
            reajuste = 0.2;
            salarioComReajuste = salario * 1.2;
        } else if (salario > 280 && salario <= 700){
            reajuste = 0.15;
            salarioComReajuste = salario * 1.15;
        }
        else if (salario > 700 && salario <= 1500){
            reajuste = 0.10;
            salarioComReajuste = salario * 1.10;
        } else {
            reajuste = 0.05;
            salarioComReajuste = salario * 1.05;
        }
        valorPercentual = reajuste * 100;
        valorDoAumento = salarioComReajuste - salario;

        JOptionPane.showMessageDialog(null,"Salário antes do reajuste: "+salario+"\n" +
                "Percentual de aumento: "+valorPercentual+"%\n" +
                "Valor do aumento: "+valorDoAumento+"\n" +
                "Novo salário: "+salarioComReajuste);

    }
}
