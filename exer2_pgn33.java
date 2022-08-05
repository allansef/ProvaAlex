public class exer2_pgn33 {

    public static void main(String[] args) {

        int i = 0;
        System.out.println("Números primos de 1 a 123: ");
        for (i = 0; i < 124; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0 && i % 6 != 0 && i % 7 != 0 && i % 8 != 0
                    && i % 9 != 0) {
                System.out.println(i);
                System.out.println("----");
            }
        }
    }
}