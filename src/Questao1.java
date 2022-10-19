import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um Numero ");
        int num = ler.nextInt();

        
         if(num == 0){
            System.out.println("Esse número é igual a 0");

         }
         else if(num < 0){
            System.out.println("Esse número é menor que 0");
         }
         else if(num > 0){
            System.out.println("Esse número é maior 0");
         }
         ler.close();

      
    }
}
