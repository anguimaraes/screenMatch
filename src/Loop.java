import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double media = 0;

        for (int i = 1; i < 4; i++) {

            System.out.println("Digite a " + i + "º nota: ");
            nota = leitura.nextDouble();
            media += nota;

        }
        System.out.println("A média das notas é: " + String.format("%.2f", media/3));
    }
}
