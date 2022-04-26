package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static  void main(String[] args){

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 14;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");

        }else {
            System.out.println("Nao autorizao comprar bebida alcolica");

        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizao comprar bebida alcolica");

        }



    }


}
