import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a distância em quilômetros: ");
        int distancia = input.nextInt(); 
        
        int velocidadeX = 60; 
        int velocidadeY = 90; 
        
        int velocidadeRelativa = velocidadeY - velocidadeX;
        
        int tempo = (distancia * 60) / velocidadeRelativa; 
        
        System.out.println("Tempo necessário: " + tempo + " minutos");
        
        input.close(); 
    }
}
