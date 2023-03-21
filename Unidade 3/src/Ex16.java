import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        int valorCompra = input.nextInt();

        System.out.print("Digite o valor pago pelo cliente: ");
        int valorPago = input.nextInt();

        int troco = valorPago - valorCompra;

        int notas100 = troco / 100;
        troco = troco % 100;

        int notas10 = troco / 10;
        troco = troco % 10;

        int notas1 = troco;

        System.out.println("O troco é: " + (valorPago - valorCompra) + " reais");
        System.out.println("Notas de 100 reais: " + notas100);
        System.out.println("Notas de 10 reais: " + notas10);
        System.out.println("Notas de 1 real: " + notas1);
        
      input.close();

    }
}
