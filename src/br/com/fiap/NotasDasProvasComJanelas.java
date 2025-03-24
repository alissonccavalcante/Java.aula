package br.com.fiap;

import javax.swing.*;

public class NotasDasProvasComJanelas {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, media = 0;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite a primeira nota: ");
             num1 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a segunda nota: ");
             num2 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a terceira nota:");
             num3 = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a quarta nota: ");
             num4 = Integer.parseInt(auxiliar);
             media = (num1 + num2 + num3 + num4)/4;
             JOptionPane.showInputDialog("Sua média foi de: " + media);

        } catch (Exception  e) {
            JOptionPane.showInputDialog("Caractere inserido está incorreto.");
        }

        }

    }

