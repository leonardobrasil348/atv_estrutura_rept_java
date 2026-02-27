import java.util.Scanner;

public class quest16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saltoMaior = 0;
        double saltoMenor = 0;
        double somaDistanciaSalto = 0;

        System.out.println("Informe a quantidade a distância atingida nos saltos feitos pelo atleta a seguir.");

        for (int i = 1; i <= 5; i++){
            double distanciaSaltos = scan.nextDouble();

            somaDistanciaSalto += distanciaSaltos;

            if (i == 1){
                saltoMenor = distanciaSaltos;
                saltoMaior = distanciaSaltos;

                } else if (distanciaSaltos < saltoMenor){
                    saltoMenor = distanciaSaltos;

                } else if (distanciaSaltos > saltoMaior){
                    saltoMaior = distanciaSaltos;

                }
        }
        System.out.printf("A média da distância dos saltos é: %.2f\n", somaDistanciaSalto/5);
        System.out.printf("O menor distância de salto dos saltos dados foi: %.2f\n", saltoMenor );
        System.out.printf("O maior distância de salto dos saltos dados foi: %.2f\n", saltoMaior );
    }
}
