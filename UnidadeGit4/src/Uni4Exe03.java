import java.util.Scanner;
public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor maior que 0 aqui para vermos se ele é mais que outro numero: ");
        int numero1 = input.nextInt();

        System.out.println("Digite novamente um valor maior que 0 aqui para vermos se ele é mais que outro numero: ");
        int numero2 = input.nextInt();

        input.close();

        if (numero1 > numero2){
            System.out.println("O primeiro numero digitado foi o maior que o segundo digitado");           
        } else{
            System.out.println("O segundo numero digitado foi o maior que o segundo primeiro");           
        }

    }
}