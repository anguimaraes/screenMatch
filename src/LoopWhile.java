import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Digite uma nota ou -1 para finalizar: ");
            nota = leitura.nextDouble();

            if (nota != -1){
                media += nota;
                totalDeNotas++;
            }
        }
        if(totalDeNotas == 0){
            System.out.println("Nenhuma nota foi atribuida");
        }else{
            System.out.println("A médias das notas é: " + media/totalDeNotas);
        }



    }
}
