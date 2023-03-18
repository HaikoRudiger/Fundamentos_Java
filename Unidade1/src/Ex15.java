import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor monetário: ");
        double valor = input.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");

        int notas100 = (int) (valor / 100); // (Int) faz com que o valor 9.4 vire 9 somente 
        valor -= notas100 * 100;

        int notas50 = (int) (valor / 50);
        valor -= notas50 * 50;

        int notas20 = (int) (valor / 20);
        valor -= notas20 * 20;

        int notas10 = (int) (valor / 10);
        valor -= notas10 * 10;

        int notas5 = (int) (valor / 5);
        valor -= notas5 * 5;

        int notas2 = (int) (valor / 2);
        valor -= notas2 * 2;

        int moedas1 = (int) valor;
        valor -= moedas1;

        int moedas50 = (int) (valor / 0.5);
        valor -= moedas50 * 0.5;

        int moedas25 = (int) (valor / 0.25);
        valor -= moedas25 * 0.25;

        int moedas10 = (int) (valor / 0.10);
        valor -= moedas10 * 0.10;

        int moedas05 = (int) (valor / 0.05);
        valor -= moedas05 * 0.05;

        int moedas01 = (int) Math.round(valor / 0.01);

        System.out.println("Notas necessárias:");
        System.out.println(notas100 + " nota de R$ 100,00");
        System.out.println(notas50 + " nota de R$ 50,00");
        System.out.println(notas20 + " nota de R$ 20,00");
        System.out.println(notas10 + " nota de R$ 10,00");
        System.out.println(notas5 + " nota de R$ 5,00");
        System.out.println(notas2 + " nota de R$ 2,00");
        System.out.println(moedas1 + " moeda de R$ 1,00");
        System.out.println(moedas50 + " moeda de R$ 0,50");
        System.out.println(moedas25 + " moeda de R$ 0,25");
        System.out.println(moedas10 + " moeda de R$ 0,10");
        System.out.println(moedas05 + " moeda de R$ 0,05");
        System.out.println(moedas01 + " moeda de R$ 0,01");

        input.close();
    }
}
