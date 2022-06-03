public class BMExercicio08 {
    public static void main(String[] args) {
        int numero = 1;

        System.out.println("Todos os multiplos de 3, entre 1 e 100:");

        while (numero < 100) {
            if (numero % 3 == 0) {
                System.out.print(numero + " ");
            }
            numero += 1;
        }
    }
}
