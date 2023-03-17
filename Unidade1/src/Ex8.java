/*
 
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, 
o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

*/

import java.util.Scanner;

public class Ex8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o codigo da peça 1: ");
        String codigoPeca1 = input.nextLine();

        System.out.println("O numero de peças da primeira peça 1: ");
        Integer pecas1 = input.nextInt();

        System.out.println("Digite o valor de cada peça 1:");
        Float valorPeca1 = input.nextFloat();

        
        System.out.println("Digite o codigo da peça 2: ");
        String codigoPeca2 = input.nextLine();

        System.out.println("O numero de peças da segunda peça 2: ");
        Integer pecas2 = input.nextInt();

        System.out.println("Digite o valor de cada peça 2:");
        Float valorPeca2 = input.nextFloat();

        Float valor = (pecas1 * valorPeca1) + (pecas2 * valorPeca2);
        
        System.out.println("Os codigos das peças 1 " + codigoPeca1 + " e codigo das peças 2 " + codigoPeca2 + " O valor a ser pago é  R$" + valor);

        input.close();
    }
}