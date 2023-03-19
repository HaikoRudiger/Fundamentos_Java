import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int suco1 = 0;
        int suco2 = 0;
        int suco3 = 0;


        while (true){

            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Suco de 350 ml");
            System.out.println("2 - Suco de 600 ml");
            System.out.println("3 - Suco de 2 litros");
            System.out.println("4 - Sair");

            int opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Quantos sucos deseja comprar? ");
                suco1 = input.nextInt();

            }  else if (opcao == 2){
                System.out.println("Quantos sucos deseja comprar? ");
                suco2 = input.nextInt();

            } else if (opcao == 3){
                System.out.println("Quantos sucos deseja comprar? ");
                suco3 = input.nextInt();
            
            } else {
                break;
            }

            
        }
        
        Double resultado = (suco1 * 0.35) + (suco2 * 0.60) + (suco3 * 2.00);

        System.out.println("O total de litros que o cliente comprou foi: " + resultado + "L");


        input.close();
    }
}