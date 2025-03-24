package br.com.fiap;

import javax.swing.*;

public class CalculoAreaComJanelas {
    public static void main(String[] args) {
        double pi = Math.PI, areaDoCirculo = 0, areaTotal;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Qual a área do círculo? ");
            areaDoCirculo = Integer.parseInt(auxiliar);
            areaTotal = (areaDoCirculo * areaDoCirculo) * pi;
            JOptionPane.showMessageDialog(null,"A área total é de" + areaTotal);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Caractere inserido está incorreto");
        }

    }
}
