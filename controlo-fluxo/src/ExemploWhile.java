import java.util.Random;
public class ExemploWhile {
    public static void main(String[] args) {

        Double mesada = 50.00;
        System.out.println("O valor que ganhei de mesada foi: R$"+ mesada);

        while(mesada > 0){

        Random gerador = new Random();
        Double valorDoce = gerador.nextDouble(1, 15);
            mesada = mesada - valorDoce;

        System.out.println("valor do item: R$" + valorDoce);
        }
        System.out.println("O valor restante da mesada foi de R$" + mesada);
    }
}

