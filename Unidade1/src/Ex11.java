import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite alguns valores para poder calcular: ");
        
        System.out.println("Digite um numero para valor de A: ");
        Double numA = input.nextDouble();

        System.out.println("Digite um numero para valor de B: ");
        Double numB = input.nextDouble();

        System.out.println("Digite um numero para valor de C: ");
        Double numC = input.nextDouble();

        Double areaTri = (numA * numC) / 2;

        Double raioQuadrado = Math.pow(numC, 2); //elevar um número a uma potência 

        Double areaCir =  3.14159 * raioQuadrado; 

        Double areaTra = ((numA + numB) * numC) / 2;

        Double areaQua = numB * numB;

        Double areaRetan = numA * numB;

        System.out.println("Area do triangulo: " + areaTri);
        System.out.println("Area do cirulo: " + areaCir);
        System.out.println("Area do trapezio: " + areaTra);
        System.out.println("Area do quadrado: " + areaQua);
        System.out.println("Area do retangulo: " + areaRetan);

        input.close();

    }
}
