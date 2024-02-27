public class CaixaEletronico {
    public static void main(String[] args) {
        Double valor = 10.0;
        Double valorAtualizado = 25.0;

        if (valor < valorAtualizado) {
            valorAtualizado = valorAtualizado - valor;
        }

        System.out.println(valorAtualizado);
    }

}
