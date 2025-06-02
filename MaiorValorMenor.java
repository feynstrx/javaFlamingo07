package javaLista07;
import java.util.Scanner;

public class MaiorValorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            int num = sc.nextInt();
            if (num < 0) break;

            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor informado: " + maior);
            System.out.println("Menor valor informado: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

        sc.close();
    }
}