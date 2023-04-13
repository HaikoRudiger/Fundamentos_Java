import java.util.Scanner;
public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Renda Anual: ");
        double rendaA = input.nextDouble();
    
        System.out.println("Numeros de contribuinte: ");
        int contribuinteN = input.nextInt();

        input.close();

        double descontoContri = (contribuinteN * 0.02);

        double rendaLiquida = rendaA - (rendaA * descontoContri);

        if(rendaLiquida < 2000){
            System.out.println("Não paga imposto.");
        } else if (rendaLiquida >= 2000 && rendaLiquida < 5000){
            double total = (rendaLiquida * 0.05);
            System.out.println("O imposto será de 5% e pagará R$ " + total);
        } else if (rendaLiquida >= 5000 && rendaLiquida < 10000){
            double total = (rendaLiquida * 0.10);
            System.out.println("O imposto será de 10% e pagará R$ " + total);
        } else {
            double total = (rendaLiquida * 0.15);
            System.out.println("O imposto será de 15% e pagará R$ " + total);
        }

    
        }
}

