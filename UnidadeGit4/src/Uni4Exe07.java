import java.util.Scanner;
public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso: ");
        float peso = input.nextFloat();

        input.close();

        if (peso >= 50){
            float pesoExcedido = peso - 50;
            float qtAdicional = (pesoExcedido / 20) + 1;
            float valorPagar = 0.45f + 0.45f * qtAdicional;
            System.out.println("Custo do selo R$" + String.format("%2.f", valorPagar));
        } else {
            float valorPagar1 = 0.45f;
            System.out.println("Custo do selo R$" + valorPagar1);
        }
        



        

    }
}