import java.util.Scanner;

public class exer5_pgn33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, hora;

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        hora = input.nextFloat();

        salario = (hora * 10.25);

        System.out.println("Seu salário a receber é de: R$" + salario);
        if (salario < 50) {
            System.out.println("Atenção, dirija-se à direção do hotel");
        }
    }
}