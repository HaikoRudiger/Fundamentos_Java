import java.util.Scanner;
public class Uni4Exe26 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a opção: ");
        System.out.println("T : Calcular a área de um triângulo de base b e altura h");
        System.out.println("Q : Calcular a área de um quadrado de lado l");
        System.out.println("R : Calcular a área de um retângulo de base b e altura h");
        System.out.println("C : Calcular a área de um círculo de raio r");
        String opcao = input.next().toUpperCase(); // Coloca a primeira letra em maiúscula 

        switch (opcao){
            case "T":
                System.out.println("Digite a base e a altura do triangulo: ");
                double base = input.nextDouble();
                double altura = input.nextDouble();
                System.out.println("Área do triangulo = " + base * altura / 2);    
            break; 

            case "Q":
                System.out.println("Digite o lado: ");
                double lado = input.nextDouble();
                System.out.println("Area do quadrado =  " + lado * lado);
            break;

            case "R":
                System.out.println("Digite a base e a altura do retangulo: ");
                double baseR = input.nextDouble();
                double alturaR = input.nextDouble();
                System.out.println("Area do retangulo = " + baseR * alturaR);
            break;

            case "C":
                System.out.println("Digite o raio: ");
                double raio = input.nextDouble();
                System.out.println("Area do circulo = " + Math.PI * Math.pow(2, raio));
            break;

            default:
                System.out.println("Opção invalida");
               
            input.close();

        }

        


    }
}
