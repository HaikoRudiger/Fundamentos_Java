import java.util.Scanner;
public class Uni4Exe26 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a opção: ");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = input.nextInt();

        switch (opcao){
            case 1:
                double soma = numero1 + numero2;
                System.out.println("A soma deles é " + soma);
            break; 

            case 2:
                double diferenca = numero1 + numero2;
                System.out.println("A diferença deles é " + diferenca);
            break;

            case 3:
                double multicacao = numero1 * numero2;
                System.out.println("A multicacao deles é " + multicacao);
            break;

            case 4:
                if (numero2 != 0){
                    double divisao = numero1 / numero2;
                    System.out.println("A divisao deles é " + divisao);
                }  else {
                    System.out.println("Opção invalida para divisão");
                }
            break;

            default:
                System.out.println("Opção invalida");
               
            
            
        }

        


    }
}
