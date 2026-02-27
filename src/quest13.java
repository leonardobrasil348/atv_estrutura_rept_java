import java.util.Scanner;

public class quest13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numSec = 20;

        while (true)
        {
            System.out.println("Advinhe o número: ");
            int chute = scan.nextInt();

            if (chute == numSec)
            {
                System.out.println("Você acertou, o número secreto é " + numSec);
                break;
            } else if (chute < numSec) {
                System.out.println("Chute um número maior");

            } else
            {
                System.out.println("chute um número menor");
            }
        }
    }
}