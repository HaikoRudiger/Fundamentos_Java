import java.util.Scanner;

public class Uni4Uri1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();


        input.close();

        if (horaFinal <= horaInicial) { //Jogo terminou no dia Seguinte
            int resultado = (horaFinal - horaInicial) + 24;
            System.out.println("O JOGO DUROU "+ resultado +" HORA(S)");

        } else { //Mesmo dia o jogo terminou 
            int resultado = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU "+ resultado +" HORA(S)");
        }

        
    }
}