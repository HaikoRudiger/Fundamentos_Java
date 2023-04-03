import java.util.Scanner;
public class Uni4Exe11 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o Ano de nascimento do primeiro filho: ");
        Integer anoP = input.nextInt();
    
        System.out.println("Digite o Ano de nascimento do segundo filho: ");
        Integer anoS = input.nextInt();

        System.out.println("Digite o Ano de nascimento do terceiro filho: ");
        Integer anoT = input.nextInt();

        input.close();

        if (anoP == anoS && anoP == anoT && anoS == anoT){
            System.out.println("São Trigemeos");    
        } else if (anoP != anoS && anoP != anoT && anoS != anoT){
            System.out.println("São apenas irmãos");  
        } else {
            System.out.println("Dois dos irmãos são gêmeos");  
        }


        }
}