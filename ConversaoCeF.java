package javaLista07;

public class ConversaoCeF {
    public static void main(String[] args) {
        int celsius = 10;
        while (celsius <= 100) {
            double fahrenheit = (9 * celsius + 160) / 5.0;
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
            celsius += 10;
        }
    }
}