import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        //comando para interagir com o usuário
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Digite o ano de lançamento: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite a sua nota sobre o filme: ");
        double nota = leitura.nextDouble();

        System.out.println("O seu filme favorito é: " + filme);
        System.out.println("O ano de lançamento foi em: " + anoDeLancamento);
        System.out.println("Sua avaliação foi: " + nota);
    }
}
