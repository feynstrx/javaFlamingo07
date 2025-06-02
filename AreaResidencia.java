package javaLista07;
import java.util.Scanner;

public class AreaResidencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaTotal = 0;
        String resposta;

        do {
            System.out.print("Nome do cômodo: ");
            String nome = sc.next();
            System.out.print("Largura do cômodo (m): ");
            double largura = sc.nextDouble();
            System.out.print("Comprimento do cômodo (m): ");
            double comprimento = sc.nextDouble();

            double area = largura * comprimento;
            areaTotal += area;
            System.out.println("Área do " + nome + ": " + area + " m²");

            System.out.print("Deseja adicionar outro cômodo? (SIM/NAO): ");
            resposta = sc.next().toUpperCase();
        } while (!resposta.equals("NAO"));

        System.out.println("Área total da residência: " + areaTotal + " m²");
        sc.close();
    }
}