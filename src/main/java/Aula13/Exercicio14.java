package Aula13;

import javax.swing.*;

public class Exercicio14 {
    public static void main(String[] args) {

        int tamanhoArquivo = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do arquivo em MB: "));
        int velocidadeLink = Integer.parseInt(JOptionPane.showInputDialog("Velocidade de internet Mbps"));

        double tempo = ((double)tamanhoArquivo / velocidadeLink)/ 60;
        JOptionPane.showMessageDialog(null,"Tempo de Download em minutos: " + tempo);

    }
}
