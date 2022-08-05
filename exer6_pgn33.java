import java.util.Scanner;

public class exer6_pgn33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double libras, quilos;
        int escolha;

        System.out.print(
                "Digite 1 se quiser converter Libras para Quilos ou digite 2 se quiser converter Quilos para Libras: ");
        escolha = input.nextInt();

        if (escolha == 1) {

            System.out.print("Digite a quantidade de Libras que deseja converter para Quilos: ");
            libras = input.nextFloat();
            quilos = ((libras * 454) / 1000);
            System.out.println("=================================");
            System.out.println("O resultado é de " + quilos + " Quilos.");
        } else if (escolha == 2) {

            System.out.print("Digite a quantidade de Quilos que deseja converter para Libra: ");
            quilos = input.nextFloat();
            libras = ((quilos * 1000) / 454);
            System.out.println("=================================");
            System.out.println("O resultado é de " + libras + " Quilos.");
        } else {

            System.out.println("[ERRO] Digite um número válido!");
        }
    }
}