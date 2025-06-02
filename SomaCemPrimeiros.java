package javaLista07;

public class SomaCemPrimeiros {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("A soma dos 100 primeiros números é: " + soma);
    }
}