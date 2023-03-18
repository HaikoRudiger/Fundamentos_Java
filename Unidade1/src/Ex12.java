import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos calcular a distancia de dois eixo X e Y em um plano!");

        System.out.println("Digite o valor do x1: ");
        Double x1 = input.nextDouble();

        System.out.println("Digite o valor do x2: ");
        Double x2 = input.nextDouble();

        System.out.println("Digite o valor do y1: ");
        Double y1 = input.nextDouble();

        System.out.println("Digite o valor do y2: ");
        Double y2 = input.nextDouble();

        Double cal1 = (x2 - x1);

        Double cal2 = (y2 - y1);

        Double quadrado1 = Math.pow(cal1, 2);

        Double quadrado2 = Math.pow(cal2, 2);

        Double resultadoQua = quadrado1 + quadrado2;

        Double distancia = Math.sqrt(resultadoQua); // Está calculando a raiz quadrada

        System.out.println("A distancia entre os pontos é: " + String.format("%.2f", distancia));

        input.close();
    }
}
