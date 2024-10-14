public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = false;
        String tipoDePlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("O filme é recente!");
        }else{
            System.out.println("O filme é velho!");
        }

        if (incluidoNoPlano == true || tipoDePlano.equals("plus")){
            System.out.println("Filme liberado!");
        } else {
            System.out.println("necessário pagar a locação");
        }

    }
}
