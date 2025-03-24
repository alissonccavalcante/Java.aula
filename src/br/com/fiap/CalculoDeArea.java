package br.com.fiap;

import java.util.Scanner;

public class CalculoDeArea {
    public static void main(String[] args) {
        double pi = Math.PI;
        double area = 0;
        double raioDoCirculo;
        try {
            Scanner scan;
            scan = new Scanner(System.in);
            System.out.println("Digite o raio da área a ser calculado: ");
            area = scan.nextDouble();
            System.out.println("Digite o valor de Pi: ");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
