import java.util.Scanner;

public class exercise_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numMenor = 0;

        System.out.println("Informe dez números a seguir.");

        for (int i = 1; i <= 10; i++){
            int userNum = scan.nextInt();
            if (i == 1){
                numMenor = userNum;
            } else if (userNum < numMenor){
                numMenor = userNum;
            }
        }

        System.out.println("O menor número dos quais você inseriu foi: " + numMenor);
    }
}