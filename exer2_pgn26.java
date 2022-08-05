import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float h, b, B, area;

        System.out.println("Digite a altura: ");
        h = entrada.nextFloat();
        System.out.println("Digite a base maior: ");
        B = entrada.nextFloat();
        System.out.println("Digite a base menor: ");
        b = entrada.nextFloat();

        area = (h * (b + B)) / 2;

        System.out.println("O valor da área é: " + Math.round (area) );
        

        
    }
    
}
