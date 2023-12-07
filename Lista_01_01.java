import java.util.Scanner;

public class Lista_01_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String nome = input.nextLine();

        System.out.print("Qual é sua idade? \n");
        int idade = input.nextInt();
        input.nextLine();

        System.out.printf("Qual é sua profissão? %n");
        String profissao = input.nextLine();

    }
}
