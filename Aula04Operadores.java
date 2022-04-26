package academy.devdojo.maratonajava.introducao;

import java.awt.desktop.SystemEventListener;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - / *
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("Resultado:"+c);

        // %
        int resto = 27 % 7;
        System.out.println(resto);

        // < > <= >= == !=

        boolean idadeMaior = 10 > 20;
        boolean idadeMeno = 10 < 20;
        boolean idadeIgual = 10 == 20;
        boolean idadeIgualDez = 10 == 10.0;
        boolean idadeDiferenteDez = 10 != 10.0;

        System.out.println(idadeMaior);
        System.out.println(idadeMeno);
        System.out.println(idadeIgualDez);
        System.out.println(idadeIgual);
        System.out.println(idadeDiferenteDez);


        // && (AND) // (or)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4673;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3303;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPsy = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPsy || valorTotalContaPoupanca > valorPsy;
        System.out.println("isPlaystationCincoCompravel" +isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // -- ++
        int contador = 0;
        contador +=1; // contador = contador + 1
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);











    }
}





