import java.util.Scanner;

public class quest9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName;
        String userPassword;

        for (int i = 1; ; i++){
            System.out.println("Digite seu nome de usuário: ");
            userName = scan.next();

            System.out.println("Digite sua senha: ");
            userPassword = scan.next();

            if (userName.equalsIgnoreCase(userPassword)){
                System.out.println("O seu nome de usuário e senha devem ser diferentes. Tente novamente.");
            }else {
                System.out.println("Seja bem-vindo(a)!");
                break;
            }
        }

    }
}
