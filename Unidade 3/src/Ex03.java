import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor atual da gasolina por litro: ");
        Float gasolina = input.nextFloat();

        System.out.println("Digite o valor a pagar: ");
        Float pagamento = input.nextFloat();

        Float litros = pagamento / gasolina; 

        input.close();

        System.out.println("Da para colocar " + litros + "L de gasolina");


    }
}
