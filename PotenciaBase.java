package javaLista07;
import java.util.Scanner;

public class PotenciaBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();

        int resultado = 1, i = 1;
        while (i <= expoente) {
            resultado *= base;
            i++;
        }
        System.out.println(base + "^" + expoente + " = " + resultado);
        sc.close();
    }
}