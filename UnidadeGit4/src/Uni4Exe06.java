import java.util.Scanner;
public class Uni4Exe06 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite umas das opções: ");
        System.out.println("M");
        System.out.println("F");
        System.out.println("I");

        String resposta = input.nextLine().toUpperCase();

        input.close();


        if (resposta.equals("M")){
            System.out.println("Masculino");
        } else if (resposta.equals("F")){
            System.out.println("Feminino");
        } else if (resposta.equals("I")){
            System.out.println("Não Informado");
        } else {
            System.out.println("Entrada Incorreta");
        }
        



        

    }
}