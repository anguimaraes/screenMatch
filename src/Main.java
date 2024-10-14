//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Imprimindo na tela
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        //Declarando variaveis
        int anoDeLancamento = 2022;

        System.out.println("Ano de lançamento: " + anoDeLancamento);

        String sinopse;
        sinopse = "Filme de aventura com o Tom Cruise";

        System.out.println(sinopse);

        /* usando casting ou seja convertendo valores (nesse ex vamos ter uma variavel int que vai armazenar a média das notas, mas para isso ela teria que ser float ou double, mas vamos forçar ela sendo int a armazenar a média(que vai passar a ser número inteiro)) */

        double n1 = 8.5;
        double n2 = 5.5;

        int classificacao = (int )(n1 + n2) /2;

        System.out.println("A média das notas de avaliação é: " + classificacao);

        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        // Exercicio - converter graus Celsius para Fahrenheit

        double temperatura = 35;

        double conversao = (temperatura * 1.8) / 32;

        System.out.println("A conversão de temperatura é: " + conversao);
        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    }
}