import java.util.Scanner;

public class quest6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretNum = 245;
        int userNum;

        System.out.print("Tente adivinhar o número secreto! Insira um número: ");
        userNum = scan.nextInt();

        while (userNum != secretNum){
            System.out.print("Tente novamente! Insira um novo número: ");
            userNum = scan.nextInt();

            if (userNum == secretNum){
                System.out.println("você acertou! O número secreto é " + secretNum);
            }
        }
    }
}
