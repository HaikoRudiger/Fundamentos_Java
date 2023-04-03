import java.util.Scanner;
public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade de Marquinhos: ");
        Integer nomeM = input.nextInt();
    
        System.out.println("Digite a idade de Zezinho: ");
        Integer nomeZ = input.nextInt();

        System.out.println("Digite a idade de Luluzina: ");
        Integer nomeL = input.nextInt();

        input.close();

        if (nomeM < nomeZ && nomeM < nomeL){
            System.out.println("Marquinhos é o caçula");
        } else if (nomeZ < nomeM && nomeZ < nomeL){
            System.out.println("Zezinho é o caçula");
        } else {
            System.out.println("Luluzina é o caçula");
        }

    }
}