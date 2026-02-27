import java.util.Scanner;

public class quest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum;
        int soma = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Insira sua idade: ");
             userNum = scan.nextInt();

            soma += userNum;
            System.out.println(soma);
        }

        int resultado = (soma / 10);
        System.out.println("A média de idade é: " + resultado);
    }
}
