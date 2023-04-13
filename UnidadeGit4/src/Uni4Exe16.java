import java.util.Scanner;
public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Digite a idade da primeira mulher: ");
        int mulher1 = input.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        int mulher2 = input.nextInt();

        System.out.println("Digite a idade do primeiro homem: ");
        int homem1 = input.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        int homem2 = input.nextInt();

        input.close();

        if (mulher1 != homem1 && mulher2 != homem2 && mulher1 != homem2 && mulher2 != homem1){
            if (homem1 > homem2 && mulher1 < mulher2){
                int soma = homem1 + mulher2;
                System.out.println("Soma = " + soma);
            } else {
                int soma = homem2 + mulher1;
                int multicacao = homem2 * mulher1;
                System.out.println("Soma = " + soma + "Multicação = " + multicacao);
            }

       
        
        } else {
            System.out.println("Valores invalidos");
        }
}
}