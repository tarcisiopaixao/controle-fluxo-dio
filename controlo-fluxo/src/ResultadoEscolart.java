public class ResultadoEscolart {
    public static void main(String[] args) {

		int  nota = 4;

        String resultado = nota>=7 ? "Você foi aprovado, sua nota foi: "+ nota : nota>=5 && nota<7 ?
        "Você foi RECUPERAÇÃO, sua nota foi: "+nota : "REPROVADO "+ nota;
        System.out.println(resultado);
    }
}
