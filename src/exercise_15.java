import java.util.Scanner;

public class exercise_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numMaior = 0;

        System.out.println("Informe dez números a seguir.");

        for (int i = 1; i <= 10; i++){
            int userNum = scan.nextInt();
            if (i == 1){
                numMaior = userNum;
            } else if (userNum > numMaior){
                numMaior = userNum;
            }
        }

        System.out.println("O maior número dos quais você inseriu foi: " + numMaior);
    }
}