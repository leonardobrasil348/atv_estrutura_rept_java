import java.util.Scanner;

public class quest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 0;

        while(i == 0){
            System.out.println("Escreva Sim ou Não: ");
            String userWord = scan.next();

            if (userWord.equalsIgnoreCase("sim")){
                System.out.println("Você decidiu continuar");
            }else if (userWord.equalsIgnoreCase("nao")){
                System.out.println("Você decidiu sair.");
                System.out.println("Programa Encerrado.");
                i = 1;
            }else {
                System.out.println("Palavra inválida. Tente novamente.");
            }

        }

    }
}
