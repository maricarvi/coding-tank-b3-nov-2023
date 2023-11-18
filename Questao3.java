import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Pergunta o valor do carro ao usuário
        System.out.println("Qual o valor do carro que deseja comprar?");
        double valorDoCarro = scanner.nextDouble();
        System.out.println(valorDoCarro);

        // Pedir a quantidade de parcelas
        System.out.println("Em quantas parcelas deseja pagar o valor de R$" + valorDoCarro + "?");
        int quantParcelas = scanner.nextInt();

        double valorDaParcela = valorDoCarro / quantParcelas;

        if ( valorDaParcela < 1000) {
            System.out.println("Quantidade inválida de parcelas. O valor a ser pago por parcela não pode ser inferior a R$1000.");
        } else {
            System.out.println("O total de sua parcela será de R$" + valorDaParcela);}

    }}
