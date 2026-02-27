import java.util.Scanner;

public class quest10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum;
        int sumNum = 0;

        System.out.println("Informe 5 números inteiros a seguir.");

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número: ");
            userNum = scan.nextInt();

            sumNum += userNum;
        }

        System.out.println("A soma dos números informados é: " + sumNum);
        System.out.println("A média dos números informados é: " + sumNum/5);
    }
}
