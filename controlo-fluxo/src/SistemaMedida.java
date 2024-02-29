public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "m";

        switch (sigla) {
            case "P" , "p" :{
                System.out.println("PEQUENO");
            }
                break;

            case "M","m":{
                System.out.println("MÉDIO");
            }
            break;

            case "G","g":{
                System.out.println("GRANDE");
            }
                break;

            default:{System.out.println("TAMANHO NÃO DEFINIDO!");}
                break;
        }

    }
}
