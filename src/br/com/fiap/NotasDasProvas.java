package br.com.fiap;

import java.util.Scanner;

public class NotasDasProvas {
    public static void main(String[] args) {
        float num1 = 0, num2 = 0, num3 = 0, num4 = 0, media = 0;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.print("Digite a nota da primeira prova: ");
            num1 = scan.nextFloat();
            scan = new Scanner(System.in);
            System.out.print("Digite a nota da segunda prova: ");
            num2 = scan.nextFloat();
            scan = new Scanner(System.in);
            System.out.print("Digite a nota da terceira prova ");
            num3 = scan.nextFloat();
            scan = new Scanner(System.in);
            System.out.print("Digite a nota da quarta prova: ");
            num4 = scan.nextFloat();
            media = (num1 + num2 + num3 + num4)/4;
            System.out.println("O valor da média é de:" + media);

        } catch (Exception e) {
            System.out.println("Formato de caractere incorreto.");
        }
    }
}
