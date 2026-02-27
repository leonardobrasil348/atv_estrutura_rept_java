import java.util.Scanner;

public class exercise_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstUserNum;
        int secondUserNum;
        int auxSwitch;

        System.out.println("Insira dois números inteiros entre 0 e 20 a seguir.");

        System.out.println("Digite o primeiro número: ");
        firstUserNum = scan.nextInt();

        while (firstUserNum < 0 || firstUserNum > 20){
            System.out.println("Apenas insira números dentro do intervalo.");
            firstUserNum = scan.nextInt();
        }

        System.out.println("Digite o segundo número: ");
        secondUserNum = scan.nextInt();

        while (secondUserNum < 0 || secondUserNum > 20){
            System.out.println("Apenas insira números dentro do intervalo.");
            secondUserNum = scan.nextInt();
        }

        if (firstUserNum > secondUserNum){
            auxSwitch = firstUserNum;
            firstUserNum = secondUserNum;
            secondUserNum = auxSwitch;
        }

        for (int i = firstUserNum; i <= secondUserNum; i++){
            System.out.println(i);
        }

    }
}
