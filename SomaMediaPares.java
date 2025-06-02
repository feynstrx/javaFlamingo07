package javaLista07;

public class SomaMediaPares {
    public static void main(String[] args) {
        int i = 50, soma = 0, qtd = 0;
        while (i <= 70) {
            if (i % 2 == 0) {
                soma += i;
                qtd++;
            }
            i++;
        }
        double media = soma / (double) qtd;
        System.out.println("Soma dos pares: " + soma);
        System.out.println("Média dos pares: " + media);
    }
}