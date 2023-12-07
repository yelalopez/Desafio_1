import java.util.Scanner;

public class Lista_01_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String userName = input.nextLine();

        System.out.println("Qual é seu salário?");
        double userSalary = input.nextDouble();
        input.nextLine();

        System.out.println("Qual é sua idade?");
        int userAge = input.nextInt();
        input.nextLine();

        System.out.println("Qual é sua altura?");
        double userHeigth = input.nextDouble();
        input.nextLine();

        System.out.println("Qual é seu sexo?");
        String userSex = input.nextLine();

        System.out.printf("Bem-vindo! Confirme seus dados por favor. %n Nome: %s %n Salario: %.2f %n Idade: %d %n Altura: %.2f %n Sexo: %s", userName, userSalary, userAge, userHeigth, userSex);

    }
}
