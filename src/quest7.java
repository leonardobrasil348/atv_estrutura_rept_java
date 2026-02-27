import java.util.Scanner;

public class quest7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum;
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 1; i <= 10; i++){
            if (i == 1){
                System.out.println("Informe 10 números inteiros a seguir.");
            }
            System.out.println("Informe o " + i + "º número: ");
            userNum = scan.nextInt();
            if (userNum % 2 == 0){
                contadorPar++;
            } else {
                contadorImpar++;
            }

        }

        System.out.println("A quantidade de números pares é: " + contadorPar);
        System.out.println("A quantidade de números ímpares é: " + contadorImpar);
    }
}
