import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Integer n1, n2, n3, n4, n5, n6;
        boolean valor;
        int i;

        n1 = 1;
        n2 = 2;

        System.out.println("1 > 2");
        if (valor = (n1 > n2)){
        System.out.println("True");  
        }else {
        System.out.println("false");      
        }

        n1 = 8;
        n2 = 8;
        
        System.out.println("***************************");
        System.out.println("8 == 8");
        if (valor = (8 == 8)){
        System.out.println("true");    
        }else{
        System.out.println("False");    
        }

        n1 = 12;
        n2 = 5;
        n3 = 6;

        System.out.println("*******************************");
        System.out.println("((12-5)>6)");
        if (valor = ((12-5)>6)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        n1 = 0;
        n2 = 3;
        n3 = 8;
        n4 = 9;

        System.out.println("********************************");
        System.out.println("(0 < 3) && (8 < 9)");
        if (valor = ((0 < 3) && (8 < 9))){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        i = 1;
        System.out.println("*********************************");
        System.out.println("((i++) > i)");
        if(valor = (i++ > i) ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        n1 = 10;
        n2 = 90;
        n3 = 50;
        n4 = 2;
        n5 = 16;
        System.out.println("********************************");
        System.out.println("(((10 * 90 / 50) – 2) == 16)");
        if (valor = (((10 * 90 / 50) - 2) == 16)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
