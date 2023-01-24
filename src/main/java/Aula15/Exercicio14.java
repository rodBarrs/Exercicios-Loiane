package Aula15;

import javax.swing.*;

public class Exercicio14 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
        double media = (nota1+nota2)/2;
        String conceito;

        if (media >= 9 && media <= 10){
            conceito = "A";
        } else if (media >= 7.5 && media < 9){
            conceito = "B";
        } else if (media >= 6 && media < 7.5){
            conceito = "C";
        } else if (media >= 4 && media < 6){
            conceito = "D";
        } else if (media >= 0 && media < 4){
            conceito = "E";
        } else {
            conceito = "Valor inválido";
        }

        String boletim = "Conceito: "+conceito;
        switch (conceito){
            case "A":
            case "B":
            case "C": boletim += "\n APROVADO"; break;
            case "D":
            case "E": boletim += "\n REPROVADO";break;
            default: break;
        }
        JOptionPane.showMessageDialog(null,boletim);
    }
}
