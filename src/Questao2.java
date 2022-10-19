import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int a = 0, maior = 0, menor = 0;

        for (int x = 0; x < 3; x++) {
            System.out.println("Insira um valor:" + +(x + 1));
            a = in.nextInt();
            if (x == 0) {
                maior = a;
                menor = a;
            }
            if (a > maior) {
                maior = a;
            }
            if (a < menor) {
                menor = a;
            }
        }
        System.out.print("Maior: " + maior + ". Menor: " + menor);
        ler.close();
        in.close();
    }
}
