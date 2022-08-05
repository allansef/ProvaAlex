import java.util.Scanner;

public class exer4_pgn33 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, horas;

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horas = input.nextFloat();

        salario = (horas * 10.25);

        System.out.println("-------------------------------------------------------");
        System.out.println("Seu salário a receber é de: R$" + salario);
    }
}