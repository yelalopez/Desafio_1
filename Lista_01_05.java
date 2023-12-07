import java.util.Scanner;

public class Lista_01_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva seu peso: ");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println("Qual é sua estatura?");
        double height = input.nextDouble();
        input.nextLine();

        String imc;
        double calIMC = weight / (height * height);

        if(calIMC < 18.5){
            imc = "abaixo do peso";
        } else if(calIMC > 18.5 && calIMC <= 24.9){
            imc = "peso normal";
        } else if (calIMC >= 25 && calIMC <= 29.9) {
            imc = "sobrepeso";
        }else {
            imc= "obesidade";
        }

        System.out.println("Seu IMC é " + imc);
    }
}
