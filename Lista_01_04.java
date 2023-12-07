import java.util.Scanner;

public class Lista_01_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de Área");
        System.out.println("1. Retângulo");
        System.out.println("2. Triângulo");
        System.out.println("3. Círculo");
        System.out.println("4. Trapézio");
        System.out.print("Escolha uma opção entre 1-4: ");

        int num = input.nextInt();
        double area;

        switch(num){
            case 1:
                System.out.print("Digite a largura: ");
                double width = input.nextDouble();
                System.out.print("Digite a altura: ");
                double height = input.nextDouble();
                area = width * height;
                System.out.printf("A área do retângulo é %.2f ", area);
                break;
            case 2:
                System.out.print("Digite a base: ");
                double base = input.nextDouble();
                System.out.print("Digite a altura: ");
                height = input.nextDouble();
                area = 0.5 * base * height;
                System.out.printf("A área do triângulo é %.2f", area);
                break;
            case 3:
                System.out.print("Digite o raio: ");
                double radius = input.nextDouble();
                area = Math.PI * Math.pow(radius, 2);
                System.out.printf("A área do círculo é %.2f", area);
                break;
            case 4:
                System.out.print("Digite a base menor: ");
                double base1 = input.nextDouble();
                System.out.print("Digite a base maior: ");
                double base2 = input.nextDouble();
                System.out.print("Digite a altura: ");
                height = input.nextDouble();
                area = ((base1 + base2) * height) / 2;
                System.out.printf("A área do trapézio é %.2f", area);
                break;
            default:
                System.out.println("Opcão Inválida!");
        }
    }
}
