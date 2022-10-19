import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();

        
         if(idade >= 16 && idade >= 18){
            System.out.println("Você pode votar e dirigir");

         }
         else if(idade >= 16 && idade <= 18){
            System.out.println("Você pode votar mas não pode dirigir");
         }
         else if(idade <= 16 && idade <= 18){
            System.out.println("Você não pode votar e não pode dirigir");
         }
         ler.close();

          }
}
