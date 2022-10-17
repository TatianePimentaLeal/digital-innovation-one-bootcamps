public class ResultadoEscolar {
    
    public static void main(String[] args) {
        int nota = 6;

        /*if (nota >= 7) { //esta sempre tem que retornar true
        System.out.println("Aprovado");

        } else if (nota >= 5 && nota < 7) { //esta condicao sempre tem que retornar true ou false
            System.out.println("Prova Recuperação");
        } else {
        System.out.println("Reprovado");
        }*/

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }
}
