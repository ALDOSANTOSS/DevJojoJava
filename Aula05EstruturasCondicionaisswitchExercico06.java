package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisswitchExercico06 {
    public static void main(String[] args){
        // Utilizando o swwitch de dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;
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

    }
}
