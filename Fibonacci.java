package javaLista07;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, i = 3;
        System.out.println("1\n1");
        while (i <= 15) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
    }
}