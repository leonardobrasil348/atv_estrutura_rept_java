import java.util.Scanner;

public class quest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            System.out.println(i + "- Insira um número inteiro: ");
            int userNum = scan.nextInt();

            if (userNum % 2 == 0){
                System.out.println(userNum + " É par");
            }else {
                System.out.println(userNum + " É ímpar");
            }
        }

        System.out.println("=========================");

        int n = 1;
        while(n <= 10){
            System.out.println(n + "- Insira um número inteiro: ");
            int userNum = scan.nextInt();

            if (userNum % 2 == 0){
                System.out.println(userNum + " É par");
            }else {
                System.out.println(userNum + " É ímpar");
            }
            n++;
        }
    }
}
