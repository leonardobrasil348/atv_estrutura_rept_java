import java.util.Scanner;

public class quest12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precoUnidadePaes;
        double somaPrecoUnidade = 0;
        int qtdUnidadePaes;

        System.out.println("Seja bem-vindo(a)! Quantos pães vai querer?");
        System.out.println("Insira o valor da quantidade: ");
        qtdUnidadePaes = scan.nextInt();

        for (int i = 1; i <= qtdUnidadePaes; i++){

                if(i > 0 && i <=  10){
                    precoUnidadePaes = 0.18;
                    somaPrecoUnidade += precoUnidadePaes;
                } else if (i > 10 && i <= 20){
                    precoUnidadePaes = 0.16;
                    somaPrecoUnidade += precoUnidadePaes;
                    } else if (i > 20 && i <= 30) {
                        precoUnidadePaes = 0.13;
                        somaPrecoUnidade += precoUnidadePaes;
                    } else {
                        precoUnidadePaes = 0.09;
                        somaPrecoUnidade += precoUnidadePaes;
                        }

                System.out.printf(i + " unidade(s): R$ %.2f\n", somaPrecoUnidade);

        }
    }
}
