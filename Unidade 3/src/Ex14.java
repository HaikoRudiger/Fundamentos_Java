import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        double distancia = input.nextDouble();

        System.out.print("Digite o tempo gasto em horas: ");
        double tempo = input.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double combustivelGasto = distancia / 12;

        System.out.println("A velocidade média da viagem foi: " + velocidadeMedia + " km/h");
        System.out.println("A quantidade de combustível gasto na viagem foi: " + combustivelGasto + " litros");

        input.close();
    }
}