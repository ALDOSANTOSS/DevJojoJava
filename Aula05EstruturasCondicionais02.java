package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args){
        // idade < 15 categoria juvenil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= categoria adulto

        Scanner input = new Scanner(System.in);


        int idade = input.nextInt();
        if (idade < 15){
            System.out.println("Categoria infantil");
        }else if(idade >= 15 && idade <18){
            System.out.println("Categoria juvenil");

        }else {
            System.out.println("Categoria adulto");

        }
        input.close();
    }


}

