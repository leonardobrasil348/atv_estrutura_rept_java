import java.util.Scanner;

public class quest11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userNum;

        System.out.println("Insira um número inteiro entre 1 e 9 a seguir:");
        userNum = scan.nextInt();

        while (userNum > 9 || userNum < 1){
            System.out.println("Inválido. Insira um número que está entre o 1 e 9.");
            userNum = scan.nextInt();
        }

        for (int i = 1; i <= 9; i++){
            System.out.println(userNum + " x " + i + " = " + (userNum * i));
        }

    }
}
