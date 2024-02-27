public class ResultadoEscolare {
    public static void main(String[] args) {

		int  nota = 10;

        if (nota >= 7){
            System.out.printf("Você foi aprovado, sua nota foi: "+ nota);
        }
        else if (nota >= 5 && nota < 7){
         System.out.printf("Você foi esta de recuperação, sua nota foi: "+ nota);
        }
        else{
        System.out.printf("Você foi reprovado, sua nota foi: "+ nota);
        }
    }
}