import java.util.Scanner;

public class exer3_pgn33 {

    public static void main(String[] args) {
        int i, num;
        int resul = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número: ");
        num = s.nextInt();

        if (num % 2 == 0) {
            System.out.println("par");
        } else
            System.out.println("impar");

        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                resul++;
                break;
            }
        }

        if (resul == 0)
            System.out.println("primo");
        else
            System.out.println("não primo ");

    }

}