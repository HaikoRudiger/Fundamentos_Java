import java.util.Scanner;
public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = input.nextLine().toUpperCase();;

        input.close();

        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("A letra que você digitou é uma volgal");
        } else {
            System.out.println("Não é uma vogal");
        }

        
    }
}