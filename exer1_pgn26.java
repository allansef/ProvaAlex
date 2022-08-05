import java.util.Scanner;

/**
 * exer1
 */
public class exer1 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            float b,h,B,area;
            System.out.println("Digite a altura: ");
            h = entrada.nextFloat();
            System.out.println("Digite a base maior: ");
            B = entrada.nextFloat();
            System.out.println("Digite a base menor: ");
            b = entrada.nextFloat();

            area = (h * (b + B)) / 2;
            
            System.out.println("Sua área é de: " + area);

        }
}