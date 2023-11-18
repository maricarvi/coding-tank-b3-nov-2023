import java.util.Scanner;
public class Questao2 {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            System.out.println("Por favor, informe um número inteiro: ");
            int n = scan.nextInt();

            String asterisco = "  ";
            for(int i = 0; i < n; i++){
                asterisco += " * ";
                System.out.println(asterisco);

            }
        }
    }

