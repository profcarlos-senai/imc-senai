import java.util.Scanner;

/**
 * Calcula o IMC (índice de massa corporal)
 * autor: carlos.correia@docentes.senai.br
 */
public class Main {
    /**
     * Calcula o IMC com programação estruturada
     * Vamos transformar isso num programa orientado a objetos
     */
    public static void main(String[] args) {
        // leitor de teclado
        Scanner teclado = new Scanner(System.in);

        // digita peso e altura
        System.out.print("Digite sua altura (1.XX): ");
        double altura = teclado.nextDouble();

        System.out.print("Digite seu peso (XX.X): ");
        double peso = teclado.nextDouble();

        // calcula o IMC
        double imc = peso / (altura*altura);

        // interpreta o resultado
        System.out.printf("Seu imc é %.1f ", imc);

        if(imc < 19){
            System.out.println("(magro)");
        } else if(imc < 25){
            System.out.println("(normal)");
        } else if(imc < 30){
            System.out.println("(sobrepeso)");
        } else {
            System.out.println("(obeso)");
        }
    }

}
