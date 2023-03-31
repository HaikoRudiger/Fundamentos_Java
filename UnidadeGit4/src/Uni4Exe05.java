import java.util.Scanner;
public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("A cor é Azul? ");
        String resposta = input.nextLine();

        input.close();

        if (resposta.equals("Sim")){
            System.out.println("Sim a cor é Azul");
        } else {
            System.out.println("Não, a cor é Azul");
        }

    }
}