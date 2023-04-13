import java.util.Scanner;
public class Uni4Exe21 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double massa  = input.nextDouble();
    
        System.out.println("Digite a sua altura: ");
        double altura  = input.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5){
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Saudável");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau I");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }

        input.close();

    }
}
