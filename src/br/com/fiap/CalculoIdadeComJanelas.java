package br.com.fiap;

import javax.swing.*;

public class CalculoIdadeComJanelas {
    public static void main(String[] args) {
        int anoNasc, anoAtual, idade;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite seu ano de Nascimento: ");
            anoNasc = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual: ");
            anoAtual = Integer.parseInt(auxiliar);
            idade = anoNasc - anoAtual;
            JOptionPane.showMessageDialog(null, "\nSua idade é de" + idade +  "anos.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
