import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = ler.nextDouble();
        System.out.println("Digite sua altura em CM: ");
        double altura = ler.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.println("IMC " + imc);

        if (imc <= 20) {
            System.out.println("Abaixo do Normal");
        } else if (imc >= 20.1 && imc <= 25) {
            System.out.println("Sua Classificação Está Dentro do Normal");
        } else if (imc >= 25.1 && imc <= 30) {
            System.out.println("Sua Classificação é de Sobrepeso ");
        } else if (imc >= 30.1 && imc <= 35) {
            System.out.println("Sua Classificação é Obesidade leve");
        } else if (imc >= 35.1 && imc <= 40) {
            System.out.println("Sua Classificação é Obesidade moderada");
        } else if (imc >= 40.1) {
            System.out.println("Sua Classificação é Obesidade mórbida");
        }

        ler.close();

    }
}
