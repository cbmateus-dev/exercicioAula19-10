import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode dirigir");

        } else {
            System.out.println("Você não pode dirigir");
        }
        ler.close();

    }
}
