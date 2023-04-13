import java.util.Scanner;
import java.time.LocalTime;

public class Uni4Exe27 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o horario(formato hh:mm) que você entrou : ");
        String horarioE = input.nextLine();

        System.out.println("Digite o horario(formato hh:mm) que você saiu : ");
        String horarioS = input.nextLine();

        LocalTime horarioE1 = LocalTime.parse(horarioE);
        LocalTime horarioS1 = LocalTime.parse(horarioS);

        double totalHoras = horarioE1 + horarioS1;

        input.close();


    }
}
