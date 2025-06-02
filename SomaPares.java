package javaLista07;

public class SomaPares {
    public static void main(String[] args) {
        int i = 1, soma = 0;
        while (i <= 500) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }
        System.out.println("A soma dos números pares de 1 a 500 é: " + soma);
    }
}