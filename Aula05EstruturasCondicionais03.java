package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000

        double salario = 3000;
        String mensagemDoar = ("Eu vou doar 500 pro DevDojo");
        String MensagemNaoDoar = ("Ainda nao tenho condiçao, mas vou ter!");
        String resultado;

        if (salario > 7000) {
            resultado = mensagemDoar;
        } else {
            resultado = MensagemNaoDoar;
        }
        System.out.println(resultado);

    }
}
