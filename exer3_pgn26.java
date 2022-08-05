import java.util.Scanner;

import org.xml.sax.SAXException;

public class exer3 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Integer n1,n2,n3,n4,n5,n6,resultado;

       n1 = 3;
       n2 = 2;
       n3 = 1; 
       n4 = 2;
       n5 = 1;
       n6 = 3;

       System.out.println("Equação A: " + n1 + " - " + n2 + " - " + n3 + " + " + n4 + " + " + n5 + " + " + n6);
       resultado = n1 - n2 - n3 + n4 + n5 + n6;
       System.out.println("resultado: " + resultado);
       System.out.println("**********************************");

        n1 = 2;
        n2 = 3;
        n3 = 4;
        n4 = 5;

       System.out.println("Equação B: " + n1 +  " * " + n2 + " - " + n3 + " * " + n4);
       resultado = (n1 * n2) - (n3 * n4);
       System.out.println("resultado: " + resultado);
       System.out.println("**********************************");

       n1 = 2;
       n2 = 6;
       n3 = 3;
       n4 = 7;
       n5 = 9;

       System.out.println("Equação C: " + n1 + " + " + n2 + " - " + n3 +" / " + n4 + " * " + n5);
       resultado = n1 + n2 - (n3 / n4 * n5);
       System.out.println("resultado: " + resultado);
       System.out.println("**********************************");

       n1 = 3;
       n2 = 4;
       n3 = 8;

       System.out.println("Equação D: " + n1 + " % " + n2 + " - " + n3);
       resultado = (n1 % n2) - n3;
       System.out.println("resultado: " + resultado);
       System.out.println("**********************************");










   } 
}
