import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = 0;
        int tentativas = 5;
        int sorteio = new Random().nextInt(100);
        System.out.println(sorteio);
        System.out.println("Tente adivinha o número de 0 a 100, você tem 5 tentativas: ");

        while(tentativas >= 1){

            numero = leitura.nextInt();

                if(numero != sorteio) {
                    tentativas--;

                    if(numero > sorteio) {
                        System.out.println("Número errado, o número é menor. Você tem mais " + tentativas + " tentativas");
                    }else{
                        System.out.println("Número errado, o número é maior. Você tem mais " + tentativas + " tentativas");
                    }

                    //System.out.println(tentativas);

                }else{
                    System.out.println("Parabéns número correto!");
                    break;
                }

            }
        if (tentativas < 1) {
            System.out.println("Acabaram o número de tentativas");
        }



    }

}

