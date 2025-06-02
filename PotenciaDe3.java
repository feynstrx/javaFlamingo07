package javaLista07;

public class PotenciaDe3 {
    public static void main(String[] args) {
        int expoente = 0;
        int resultado = 1;
        while (expoente <= 15) {
            if (expoente == 0) {
                resultado = 1;
            } else {
                resultado *= 3;
            }
            System.out.println("3^" + expoente + " = " + resultado);
            expoente++;
        }
    }
}