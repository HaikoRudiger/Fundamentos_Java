import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o tempo de duração do evento em segundos: ");
        int duracaoSegundos = input.nextInt();
        
        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        int segundos = duracaoSegundos % 60;
        
        System.out.printf("O evento teve a duração de %d horas, %d minutos e %d segundos\n", horas, minutos, segundos);
        
        input.close();
    }
}
