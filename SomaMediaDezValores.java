package javaLista07;
import java.util.Scanner;

public class SomaMediaDezValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, soma = 0;
        while (i < 10) {
            System.out.print("Digite um número: ");
            soma += sc.nextInt();
            i++;
        }
        double media = soma / 10.0;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        sc.close();
    }
}