package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisswitch05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 10;

        // char, int, byte,short, String

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Quin");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;

        }
    }
}
