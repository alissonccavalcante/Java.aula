package br.com.fiap;

import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        int anoAtual = 0, anoDeNasc = 0, idade= 0;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.print("Digite seu ano de nascimento: ");
            anoDeNasc = scan.nextInt();
            scan = new Scanner(System.in);
            System.out.print("Digite o ano atual: ");
            anoAtual = scan.nextInt();
            idade = anoAtual - anoDeNasc;
            System.out.println("Sua idade é: " + idade);
        } catch (Exception e) {
            System.out.println("Caractere que foi digita está incorreto.");
        }
    }
}
